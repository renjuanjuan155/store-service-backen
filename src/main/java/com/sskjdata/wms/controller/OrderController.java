package com.sskjdata.wms.controller;

import com.sskjdata.wms.dto.OrdersAddReq;
import com.sskjdata.wms.dto.OrdersProductAddReq;
import com.sskjdata.wms.dto.UserByIdReq;
import com.sskjdata.wms.service.OrdersService;
import com.sskjdata.wms.vo.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/20 19:42
 * @Created by meijunjie
 */
@RequestMapping("/user/order")
@RestController
@Api(tags = "用户订单")
public class OrderController {

    @Autowired
    private OrdersService ordersService;

    /*获取用户的所有订单*/
    @PostMapping(value = "getOrder")
    public R getOrder(@RequestBody UserByIdReq req){
        List<List<Map<String,Object>>> ordersByUserId = ordersService.getOrdersByUserId(req);
        if (ordersByUserId.size() > 0){

            return R.success(ordersByUserId);
        }
        return R.success("该用户没有订单信息").setCode("002");
    }

    /*添加用户订单信息*/
    @PostMapping(value = "addOrder")
    public R addOrder(@RequestBody OrdersAddReq req){
        //检测用户是否登录

        //
        ordersService.addOrders(req);
        return R.success();
    }
}
