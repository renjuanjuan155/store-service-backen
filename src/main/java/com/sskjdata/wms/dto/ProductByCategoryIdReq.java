package com.sskjdata.wms.dto;

import com.sskjdata.wms.vo.PageIn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Date 2021/1/20 11:33
 * @Created by meijunjie
 */
@Data
@ApiModel(description = "根据categoryID获取所有商品分页")
public class ProductByCategoryIdReq extends PageIn {

    @ApiModelProperty(value = "categoryID",required = true)
    private int[] categoryID;

}
