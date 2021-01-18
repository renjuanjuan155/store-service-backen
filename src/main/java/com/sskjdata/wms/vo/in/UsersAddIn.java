package com.sskjdata.wms.vo.in;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * users
 * 
 * @author guoxinyou
 * @version 1.0.0 2021-01-08
 */
@Data
@ApiModel(description = "新增users入参")
public class UsersAddIn {
    @ApiModelProperty(value = "")
    private String userName;
    @ApiModelProperty(value = "")
    private String password;
    @ApiModelProperty(value = "")
    private String userPhoneNumber;

}