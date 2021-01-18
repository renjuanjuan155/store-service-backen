package com.sskjdata.wms.vo;

import io.swagger.annotations.ApiModelProperty;
import javafx.scene.chart.ValueAxis;
import lombok.Data;
import lombok.Value;

/**
 * @Description
 * @Date 2021/1/15 16:30
 * @Created by meijunjie
 */
@Data
public class PageIn {

    @ApiModelProperty(value = "每页大小",required = true)
    private int limit;

    @ApiModelProperty(value = "当前页数",required = true)
    private int page;
}
