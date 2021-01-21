package com.sskjdata.wms.controller;

import com.sskjdata.wms.dto.ShoopingcartAddReq;
import com.sskjdata.wms.dto.ShoppingcartDeleteReq;
import com.sskjdata.wms.dto.ShoppingcartUpdateReq;
import com.sskjdata.wms.dto.UserByIdReq;
import com.sskjdata.wms.service.ShoppingcartService;
import com.sskjdata.wms.vo.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/15 16:16
 * @Created by meijunjie
 */
@RestController
@RequestMapping("/shoppingCart")
@Api(tags = "购物车")
public class ShoppingCartController {

    @Autowired
    private ShoppingcartService shoppingcartService;

    /*获取购物车信息*/
    @PostMapping(value = "/getShoppingCart")
    public R getAllProduct(@RequestBody UserByIdReq req){
        List<Map<String, Object>> shoppingByUserId = shoppingcartService.getShoppingByUserId(req);
        return R.success(shoppingByUserId);
    }

    /*插入购物车信息*/
    @PostMapping(value = "addShoppingCart")
    public R addShoppingCart(@RequestBody ShoopingcartAddReq req){

        //判断用户是否登录

        //判断用户是否已经有该商品
        int i = shoppingcartService.addShoppingCart(req);
        if (i == 0){
            return R.success("数量达到限购数量").setCode("003");
        }else if(i == 1){
            return R.success("该商品已在购物车，数量 +1").setCode("002");
        }else if (i == 2){
            return R.success("添加购物车成功");
        }
        return R.error("添加购物车失败,未知错误").setCode("005");
    }

    /*删除购物车信息*/
    @PostMapping(value = "/deleteShoppingCart")
    public R deleteShoppingCart(@RequestBody ShoppingcartDeleteReq req){

        //判断是否登录

        //先判断原先是否有该商品
        if (shoppingcartService.getCartByUserIdAndProductId(req.getUserId(),req.getProductId())){
            shoppingcartService.deleteByUserIdAndProductId(req);
            return R.success("删除购物车成功");
        }
        return R.success("该商品不在购物车").setCode("002");
    }

    /*更新购物车商品数量*/
    @PostMapping(value = "updateShoppingCart")
    public R updateShoppingCart(@RequestBody ShoppingcartUpdateReq req){

        //判断用户是否登录


        if (shoppingcartService.getCartByUserIdAndProductId(req.getUserId(),req.getProductId())){
            int i = shoppingcartService.updateShoppingCart(req);
            if (i == 0){
                return R.success("修改购物车数量成功");
            }else if (i == 1){
                return R.success("数量达到限购数量").setCode("004");
            }else if (i == 2){
                return R.success("数量没有发生变化").setCode("003");
            }
        }
        return R.success("该商品不在购物车").setCode("002");
    }
}
