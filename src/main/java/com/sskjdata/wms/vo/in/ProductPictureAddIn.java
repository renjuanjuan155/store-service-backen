package com.sskjdata.wms.vo.in;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * product_picture
 * 
 * @author guoxinyou
 * @version 1.0.0 2021-01-08
 */
@Data
@ApiModel(description = "新增product_picture入参")
public class ProductPictureAddIn {


    @ApiModelProperty(value = "")
    private Integer productId;
    @ApiModelProperty(value = "")
    private String productPicture;
    @ApiModelProperty(value = "")
    private String intro;

}