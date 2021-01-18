package com.sskjdata.wms.vo.in;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * orders
 * 
 * @author guoxinyou
 * @version 1.0.0 2021-01-08
 */
@Data
@ApiModel(description = "新增orders入参")
public class OrdersAddIn {


    @ApiModelProperty(value = "")
    private Long orderId;
    @ApiModelProperty(value = "")
    private Integer userId;
    @ApiModelProperty(value = "")
    private Integer productId;
    @ApiModelProperty(value = "")
    private Integer productNum;
    @ApiModelProperty(value = "")
    private Double productPrice;
    @ApiModelProperty(value = "")
    private Long orderTime;

}