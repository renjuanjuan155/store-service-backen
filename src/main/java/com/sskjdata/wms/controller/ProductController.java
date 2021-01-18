package com.sskjdata.wms.controller;

import com.sskjdata.wms.dto.ProductGetReq;
import com.sskjdata.wms.service.CategoryService;
import com.sskjdata.wms.service.ProductService;
import com.sskjdata.wms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/15 16:18
 * @Created by meijunjie
 */
@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "/getAllProduct")
    public R getAllProduct(@RequestBody ProductGetReq param){
        List<Map<String, Object>> allProduct = productService.getAllProduct(param);
        return R.success(allProduct);
    }

    @PostMapping(value = "getCategory")
    public R getCategory(){
        List<Map<String, Object>> category = categoryService.getCategory();
        return R.success(category);
    }

    @PostMapping(value = "getCategoryById")
    public R getCategoryById(@RequestBody String categoryName){

        return R.success();
    }
}
