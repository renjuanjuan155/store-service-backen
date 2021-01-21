package com.sskjdata.wms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Date 2021/1/20 14:15
 * @Created by meijunjie
 */
@Data
@ApiModel(description = "分类名称")
public class ProductByCategoryName {

    @ApiModelProperty(value = "分类名称",required = true)
    private String categoryName;
}
