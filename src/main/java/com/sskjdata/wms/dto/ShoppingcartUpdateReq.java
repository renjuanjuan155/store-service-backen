package com.sskjdata.wms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Date 2021/1/20 18:59
 * @Created by meijunjie
 */
@ApiModel(description = "更新购物车")
@Data
public class ShoppingcartUpdateReq {

    @ApiModelProperty(value = "用户id",required = true)
    private int userId;

    @ApiModelProperty(value = "商品id",required = true)
    private int productId;

    @ApiModelProperty(value = "购买数量",required = true)
    private int num;
}
