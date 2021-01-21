package com.sskjdata.wms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Date 2021/1/20 15:56
 * @Created by meijunjie
 */
@ApiModel(description = "根据用户名称查询用户")
@Data
public class UserByNameReq {

    @ApiModelProperty(value = "用户名称",required = true)
    private String userName;
}
