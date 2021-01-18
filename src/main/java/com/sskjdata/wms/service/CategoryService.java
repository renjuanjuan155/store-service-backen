package com.sskjdata.wms.service;

import com.sskjdata.wms.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/15 19:06
 * @Created by meijunjie
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<Map<String,Object>> getCategory(){
        return categoryMapper.getCategory();
    }

    public List<Map<String,Object>> getCategoryById(String categoryname){
        return categoryMapper.getCategoryById(categoryname);
    }
}
