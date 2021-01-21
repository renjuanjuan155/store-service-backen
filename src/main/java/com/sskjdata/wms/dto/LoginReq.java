package com.sskjdata.wms.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Date 2021/1/20 15:44
 * @Created by meijunjie
 */
@ApiModel(description = "登录参数")
@Data
public class LoginReq {

    @ApiModelProperty(value = "用户名",required = true)
    private String userName;

    @ApiModelProperty(value = "密码",required = true)
    private String password;

}
