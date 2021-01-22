package com.sskjdata.wms.service;

import com.sskjdata.wms.dto.ShoopingcartAddReq;
import com.sskjdata.wms.dto.ShoppingcartDeleteReq;
import com.sskjdata.wms.dto.ShoppingcartUpdateReq;
import com.sskjdata.wms.dto.UserByIdReq;
import com.sskjdata.wms.entity.ShoppingcartEntity;
import com.sskjdata.wms.mapper.ProductMapper;
import com.sskjdata.wms.mapper.ShoppingcartMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/20 17:07
 * @Created by meijunjie
 */
@Service
public class ShoppingcartService {

    @Autowired
    private ShoppingcartMapper shoppingcartMapper;

    @Autowired
    private ProductMapper productMapper;

    public List<Map<String,Object>> getShoppingByUserId(UserByIdReq req){
        List<Map<String, Object>> shoppingByUserId = shoppingcartMapper.getShoppingByUserId(req);
        for (Map<String,Object> map:shoppingByUserId){
            map.put("check",false);
        }
        return shoppingByUserId;
    }

    public void deleteByUserIdAndProductId(ShoppingcartDeleteReq req){
        shoppingcartMapper.deleteByUserIdAndProductId(req);
    }

    public Boolean getCartByUserIdAndProductId(int userId, int productId){
        ShoppingcartEntity req = new ShoppingcartEntity();
        req.setUserId(userId);
        req.setProductId(productId);
        if (shoppingcartMapper.getCartByUserIdAndProductId(req).size() > 0){
            return true;
        }
        return false;
    }

    public int addShoppingCart(ShoopingcartAddReq reqAdd){
        ShoppingcartEntity req = new ShoppingcartEntity();
        req.setUserId(reqAdd.getUserId());
        req.setProductId(reqAdd.getProductId());
        req.setNum(reqAdd.getNum());
        //判断是否已经存在
        if (shoppingcartMapper.getCartByUserIdAndProductId(req).size() > 0){

            //判断是否数量已经达到上限
            int maxNumByProductId = productMapper.getMaxNumByProductId(req.getProductId());
            if (req.getNum() > maxNumByProductId){
                //数量已经达到上限
                return 0;
            }
            ShoppingcartUpdateReq updateReq = new ShoppingcartUpdateReq();
            BeanUtils.copyProperties(req,updateReq);
            shoppingcartMapper.updateShoppingcart(updateReq);
            //数量更新成功
            return 1;
        }
        ShoppingcartEntity entity = new ShoppingcartEntity();
        entity.setUserId(req.getUserId());
        entity.setProductId(req.getProductId());
        entity.setNum(req.getNum());
        shoppingcartMapper.insert(entity);
        return 2;
    }

    public int updateShoppingCart(ShoppingcartUpdateReq req){
        int maxNumByProductId = productMapper.getMaxNumByProductId(req.getProductId());
        ShoppingcartEntity reqAdd = new ShoppingcartEntity();
        reqAdd.setUserId(req.getUserId());
        reqAdd.setProductId(req.getProductId());
        reqAdd.setNum(req.getNum());
        List<Map<String, Object>> list = shoppingcartMapper.getCartByUserIdAndProductId(reqAdd);
        if ((int)list.get(0).get("num") == req.getNum()){
            return 2;
        }
        if (req.getNum() <= 5){
            shoppingcartMapper.updateShoppingcart(req);
            return 0;
        }else {
            return 1;
        }
    }
}
