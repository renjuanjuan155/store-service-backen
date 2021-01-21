package com.sskjdata.wms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Date 2021/1/20 16:14
 * @Created by meijunjie
 */
@ApiModel(value = "添加收藏")
@Data
public class CollectAddReq {

    @ApiModelProperty(value = "用户id",required = true)
    private int userId;

    @ApiModelProperty(value = "商品id",required = true)
    private int productId;
}
