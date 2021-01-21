package com.sskjdata.wms.service;

import com.sskjdata.wms.mapper.CarouselMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/20 15:00
 * @Created by meijunjie
 */
@Service
public class CarouselService {

    @Autowired
    private CarouselMapper carouselMapper;

    public List<Map<String,Object>> getCarousel(){
        return carouselMapper.getCarousel();
    }
}
