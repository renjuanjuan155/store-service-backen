package com.sskjdata.wms.vo.in;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * product
 * 
 * @author guoxinyou
 * @version 1.0.0 2021-01-08
 */
@Data
@ApiModel(description = "新增product入参")
public class ProductAddIn {


    @ApiModelProperty(value = "")
    private String productName;
    @ApiModelProperty(value = "")
    private Integer categoryId;
    @ApiModelProperty(value = "")
    private String productTitle;
    @ApiModelProperty(value = "")
    private String productIntro;
    @ApiModelProperty(value = "")
    private String productPicture;
    @ApiModelProperty(value = "")
    private Double productPrice;
    @ApiModelProperty(value = "")
    private Double productSellingPrice;
    @ApiModelProperty(value = "")
    private Integer productNum;
    @ApiModelProperty(value = "")
    private Integer productSales;

}