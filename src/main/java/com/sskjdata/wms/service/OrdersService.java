package com.sskjdata.wms.service;

import com.sskjdata.wms.dto.OrdersAddReq;
import com.sskjdata.wms.dto.OrdersProductAddReq;
import com.sskjdata.wms.dto.ShoppingcartDeleteReq;
import com.sskjdata.wms.dto.UserByIdReq;
import com.sskjdata.wms.entity.OrdersEntity;
import com.sskjdata.wms.mapper.OrdersMapper;
import com.sskjdata.wms.mapper.ShoppingcartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/20 19:49
 * @Created by meijunjie
 */
@Service
public class OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private ShoppingcartMapper shoppingcartMapper;

    public List<Map<String,Object>> getOrdersByUserId(UserByIdReq req){
        List<Map<String, Object>> ordersByUserId = ordersMapper.getOrdersByUserId(req.getUserId());
        return ordersByUserId;
    }

    public void addOrders(OrdersAddReq req){

        List<OrdersProductAddReq> products = req.getProducts();

        //生成订单号和时间,获取当前时间戳
        long OrderTime = new Date().getTime();
        //生成订单id：用户id+时间戳(string)
        String orderId = "" + req.getUserId() + OrderTime;

        for (OrdersProductAddReq productAddReq : products){
            OrdersEntity entity = new OrdersEntity();
            entity.setOrderId(Long.valueOf(orderId));
            entity.setUserId(req.getUserId());
            entity.setProductId(productAddReq.getProductID());
            entity.setProductNum(productAddReq.getNum());
            entity.setProductPrice(productAddReq.getPrice());
            entity.setOrderTime(OrderTime);
            ordersMapper.insert(entity);
            //插入成功删除购物车信息
            ShoppingcartDeleteReq shoppingcartDeleteReq = new ShoppingcartDeleteReq();
            shoppingcartDeleteReq.setProductId(productAddReq.getProductID());
            shoppingcartDeleteReq.setUserId(req.getUserId());
            shoppingcartMapper.deleteByUserIdAndProductId(shoppingcartDeleteReq);
        }

    }
}
