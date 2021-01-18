package com.sskjdata.wms.vo.in;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * carousel
 * 
 * @author guoxinyou
 * @version 1.0.0 2021-01-08
 */
@Data
@ApiModel(description = "新增carousel入参")
public class CarouselAddIn {


    @ApiModelProperty(value = "")
    private String imgPath;
    @ApiModelProperty(value = "")
    private String describes;

}