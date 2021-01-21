package com.sskjdata.wms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Date 2021/1/20 19:54
 * @Created by meijunjie
 */
@ApiModel(description = "新增用户订单")
@Data
public class OrdersAddReq {

    @ApiModelProperty(value = "用户id",required = true)
    private int userId;

    @ApiModelProperty(value ="商品详细信息",required = true)
    private List<OrdersProductAddReq> products;
}
