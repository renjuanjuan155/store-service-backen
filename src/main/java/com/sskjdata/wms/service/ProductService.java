package com.sskjdata.wms.service;

import com.github.pagehelper.PageHelper;
import com.sskjdata.wms.dto.*;
import com.sskjdata.wms.mapper.CategoryMapper;
import com.sskjdata.wms.mapper.ProductMapper;
import com.sskjdata.wms.mapper.ProductPictureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Target;
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
    private CategoryMapper categoryMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductPictureMapper productPictureMapper;

    public List<Map<String,Object>> getAllProduct(ProductGetReq param){

        PageHelper.startPage(param.getCurrentPage(),param.getPageSize());
        List<Map<String,Object>> allProduct = productMapper.getAllProduct(param);
        return allProduct;
    }

    public List<Map<String,Object>> getPromoProduct(ProductByCategoryName categoryname){
        int categoryById = categoryMapper.getCategoryByName(categoryname);
        return productMapper.getPromoProduct(categoryById);
    }

    public List<Map<String,Object>> productByCategoryNames(ProductByCategoryNames categoryname){

        List<Integer> categoryIdByName1 = categoryMapper.getCategoryIdByName(categoryname.getCategoryName());
        List<Map<String,Object>> categoryIdByName = productMapper.getProductByCategory(categoryIdByName1);

        return categoryIdByName;

    }

    public List<Map<String,Object>> getProductByCategory(ProductByCategoryIdReq req){
        List<Map<String, Object>> productByCategoryId = productMapper.getProductByCategoryId(req.getCategoryID(),req.getStart(),req.getPageSize());
        return productByCategoryId;
    }

    public int getProductByCategoryTotal(ProductByCategoryIdReq req){
        int  total = productMapper.getProductByCategoryIdToTal(req.getCategoryID());
        return total;
    }

    public List<Map<String,Object>> getProductByName(ProductByNameReq req){
        List<Map<String, Object>> productByCategoryId = productMapper.getProductByName(req);
        return productByCategoryId;
    }

    public int getProductByNameTotal(ProductByNameReq req){
        int  total = productMapper.getProductByNameToTal(req);
        return total;
    }

    public Map<String,Object> getProductById(ProductByIdReq req){
        Map<String, Object> productById = productMapper.getProductById(req);
        return productById;
    }

    public List<Map<String, Object>> getProductImgByProductId(ProductByIdReq req){
        List<Map<String, Object>> productImgById = productPictureMapper.getProductImgByProductId(req);
        return productImgById;
    }
}
