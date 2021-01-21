package com.sskjdata.wms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Date 2021/1/20 13:47
 * @Created by meijunjie
 */
@Data
@ApiModel(description = "根据商品id,获取商品详细信息")
public class ProductByIdReq {

    @ApiModelProperty(value = "productID",required = true)
    private int productID;
}
