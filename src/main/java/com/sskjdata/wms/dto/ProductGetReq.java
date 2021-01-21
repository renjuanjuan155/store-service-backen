package com.sskjdata.wms.dto;

import com.sskjdata.wms.vo.PageIn;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @Description
 * @Date 2021/1/15 16:29
 * @Created by meijunjie
 */
@Data
@ApiModel(description = "获取所有商品入参")
public class ProductGetReq extends PageIn {
}
