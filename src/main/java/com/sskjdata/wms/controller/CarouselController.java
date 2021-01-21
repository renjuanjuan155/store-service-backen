package com.sskjdata.wms.controller;

import com.sskjdata.wms.service.CarouselService;
import com.sskjdata.wms.vo.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Date 2021/1/20 14:56
 * @Created by meijunjie
 */
@RestController
@Api(tags = "轮播图")
@RequestMapping("/resources")
public class CarouselController {


    @Autowired
    private CarouselService carouselService;

    /*查询轮播图*/
    @PostMapping("/carousel")
    public R getCarousel(){
        return R.success(carouselService.getCarousel());
    }
}
