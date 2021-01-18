package com.sskjdata.wms.mapper;


import com.sskjdata.wms.dto.ProductGetReq;
import com.sskjdata.wms.entity.ProductEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductMapper {
    @Delete({
        "delete from product",
        "where product_id = #{productId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer productId);

    @Insert({
        "insert into product (product_id, product_name, ",
        "category_id, product_title, ",
        "product_picture, product_price, ",
        "product_selling_price, product_num, ",
        "product_sales, product_intro)",
        "values (#{productId,jdbcType=INTEGER}, #{productName,jdbcType=CHAR}, ",
        "#{categoryId,jdbcType=INTEGER}, #{productTitle,jdbcType=CHAR}, ",
        "#{productPicture,jdbcType=CHAR}, #{productPrice,jdbcType=DOUBLE}, ",
        "#{productSellingPrice,jdbcType=DOUBLE}, #{productNum,jdbcType=INTEGER}, ",
        "#{productSales,jdbcType=INTEGER}, #{productIntro,jdbcType=LONGVARCHAR})"
    })
    int insert(ProductEntity record);

    List<Map<String,Object>> getAllProduct(ProductGetReq param);

}