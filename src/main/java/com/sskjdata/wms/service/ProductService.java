package com.sskjdata.wms.service;

import com.github.pagehelper.PageHelper;
import com.sskjdata.wms.dto.ProductGetReq;
import com.sskjdata.wms.entity.ProductEntity;
import com.sskjdata.wms.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/15 16:33
 * @Created by meijunjie
 */
@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    public List<Map<String,Object>> getAllProduct(ProductGetReq param){

        PageHelper.startPage(param.getPage(),param.getLimit());
        List<Map<String,Object>> allProduct = productMapper.getAllProduct(param);
        return allProduct;
    }
}
