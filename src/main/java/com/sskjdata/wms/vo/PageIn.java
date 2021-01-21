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
    private int pageSize;

    @ApiModelProperty(value = "当前页数",required = true)
    private int currentPage;

    @ApiModelProperty(value = "开始",required = false)
    private int start;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = (currentPage-1)*pageSize;
    }
}
