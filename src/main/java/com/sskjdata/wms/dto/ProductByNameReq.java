package com.sskjdata.wms.dto;

import com.sskjdata.wms.vo.PageIn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Date 2021/1/20 13:35
 * @Created by meijunjie
 */
@Data
@ApiModel(description = "根据搜索条件,分页获取商品信息")
public class ProductByNameReq extends PageIn {

    @ApiModelProperty(value = "搜索条件",required = true)
    private String search;
}
