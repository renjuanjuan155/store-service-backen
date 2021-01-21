package com.sskjdata.wms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Date 2021/1/20 16:28
 * @Created by meijunjie
 */
@ApiModel(description = "用户id")
@Data
public class UserByIdReq {

    @ApiModelProperty(value = "用户id",required = true)
    private int userId;
}
