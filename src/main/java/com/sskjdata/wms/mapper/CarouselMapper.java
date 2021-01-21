package com.sskjdata.wms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.tomcat.jni.Mmap;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/8 11:39
 * @Created by meijunjie
 */
@Mapper
public interface CarouselMapper {

    List<Map<String,Object>>  getCarousel();
}
