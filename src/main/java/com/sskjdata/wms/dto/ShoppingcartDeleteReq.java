package com.sskjdata.wms.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Date 2021/1/20 17:27
 * @Created by meijunjie
 */
@Data
@ApiModel(description = "删除购物车")
public class ShoppingcartDeleteReq {

    @ApiModelProperty(value = "用户id",required = true)
    private int userId;

    @ApiModelProperty(value = "商品id",required = true)
    private int productId;
}
