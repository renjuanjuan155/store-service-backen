package com.sskjdata.wms.controller;

import com.sskjdata.wms.dto.*;
import com.sskjdata.wms.service.CategoryService;
import com.sskjdata.wms.service.ProductService;
import com.sskjdata.wms.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/15 16:18
 * @Created by meijunjie
 */
@RestController
@RequestMapping(value = "/product")
@Api(tags = "商品")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;


    /*获取商品分类*/
    @RequestMapping(value = "getCategory",method = RequestMethod.POST)
    public R getCategory(){
        List<Map<String, Object>> category = categoryService.getCategory();
        return R.success(category);
    }

    /*根据商品分类名称获取首页展示的商品信息*/
    @PostMapping(value = "getPromoProduct")
    public R getPromoProduct(@RequestBody ProductByCategoryName req){
        List<Map<String, Object>> promoProduct = productService.getPromoProduct(req);
        return R.success(promoProduct);
    }

    /*根据商品分类名称获取热门商品信息*/
    @PostMapping(value = "getHotProduct")
    public R getHotProduct(@RequestBody ProductByCategoryNames categoryName){
        List<Map<String, Object>> productByCategory = productService.productByCategoryNames(categoryName);
        return R.success(productByCategory);
    }

    /*分页获取所有的商品信息*/
    @PostMapping(value = "/getAllProduct")
    public R getAllProduct(@RequestBody ProductGetReq param){
        List<Map<String, Object>> allProduct = productService.getAllProduct(param);
        return R.success(allProduct);
    }

    /*根据分类id,分页获取商品信息*/
    @PostMapping(value = "/getProductByCategory")
    public R getProductByCategory(@RequestBody ProductByCategoryIdReq req){

        List<Map<String, Object>> productByCategory = productService.getProductByCategory(req);
        int productByCategoryTotal = productService.getProductByCategoryTotal(req);

        return R.success(productByCategory).put("total",productByCategoryTotal);
    }

    /*根据搜索条件,分页获取商品信息*/
    @PostMapping(value ="/getProductBySearch")
    public R getProductBySearch(@RequestBody ProductByNameReq req){


        List<Map<String, Object>> productByName = productService.getProductByName(req);
        int productByNameTotal = productService.getProductByNameTotal(req);

        return R.success(productByName).put("total",productByNameTotal);
    }

    /*根据商品id,获取商品详细信息*/
    @PostMapping(value = "/getDetails")
    public R getDetails(@RequestBody ProductByIdReq req){
        Map<String, Object> productById = productService.getProductById(req);
        return R.success(productById);
    }

    /*根据商品id,获取商品图片,用于食品详情的页面展示*/
    @PostMapping(value = "/getDetailsPicture")
    public R getDetailsPicture(@RequestBody ProductByIdReq req){
        List<Map<String, Object>> productImgByProductId = productService.getProductImgByProductId(req);
        return R.success(productImgByProductId);
    }

}
