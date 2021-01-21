package com.sskjdata.wms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Date 2021/1/20 17:18
 * @Created by meijunjie
 */
@ApiModel(description = "插入购物车信息")
@Data
public class ShoopingcartAddReq {

    @ApiModelProperty(value = "用户id",required = true)
    private int userId;

    @ApiModelProperty(value = "商品id",required = true)
    private int productId;

    @ApiModelProperty(value = "购买数量",required = true)
    private int num;
}
