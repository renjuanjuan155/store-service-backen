package com.sskjdata.wms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Date 2021/1/20 20:07
 * @Created by meijunjie
 */
@ApiModel(description = "订单商品添加详情")
@Data
public class OrdersProductAddReq {

    @ApiModelProperty(value = "",required = true)
    private Boolean check;
    @ApiModelProperty(value = "",required = true)
    private int id;
    @ApiModelProperty(value = "最大限制数",required = true)
    private int maxNum;
    @ApiModelProperty(value = "订单数量",required = true)
    private int num;
    @ApiModelProperty(value = "总价格",required = true)
    private double price;
    @ApiModelProperty(value = "商品id",required = true)
    private int productID;
    @ApiModelProperty(value = "商品封面",required = true)
    private String productImg;
    @ApiModelProperty(value = "商品名称",required = true)
    private String productName;

}
