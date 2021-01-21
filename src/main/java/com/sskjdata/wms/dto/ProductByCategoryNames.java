package com.sskjdata.wms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Date 2021/1/20 14:40
 * @Created by meijunjie
 */
@Data
@ApiModel("分类名称数组")
public class ProductByCategoryNames {

    @ApiModelProperty(value = "分类名称数组",required = true)
    private String[] categoryName;
}
