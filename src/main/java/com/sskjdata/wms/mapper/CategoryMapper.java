package com.sskjdata.wms.mapper;

import com.sskjdata.wms.entity.CategoryEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/8 11:40
 * @Created by meijunjie
 */
public interface CategoryMapper {

    void insert(CategoryEntity param);

    List<Map<String,Object>> getCategory();

    List<Map<String,Object>> getCategoryById(@Param("categoryName") String categoryName);
}
