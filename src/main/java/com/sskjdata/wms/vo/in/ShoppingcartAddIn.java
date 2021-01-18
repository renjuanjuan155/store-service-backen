package com.sskjdata.wms.vo.in;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * shoppingcart
 * 
 * @author guoxinyou
 * @version 1.0.0 2021-01-08
 */
@Data
@ApiModel(description = "新增shoppingcart入参")
public class ShoppingcartAddIn {


    @ApiModelProperty(value = "")
    private Integer userId;
    @ApiModelProperty(value = "")
    private Integer productId;
    @ApiModelProperty(value = "")
    private Integer num;

}