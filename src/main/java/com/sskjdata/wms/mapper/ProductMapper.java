package com.sskjdata.wms.mapper;


import com.sskjdata.wms.dto.ProductByCategoryIdReq;
import com.sskjdata.wms.dto.ProductByIdReq;
import com.sskjdata.wms.dto.ProductByNameReq;
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

    List<Map<String,Object>> getPromoProduct(int categoryId);

    List<Map<String,Object>> getProductByCategory(List<Integer> list);

    List<Map<String,Object>> getProductByCategoryId(@Param("arry") int[] arry,@Param("start")int start,@Param("pageSize")int pageSize );

    int getProductByCategoryIdToTal(@Param("arry") int[] arry );

    List<Map<String,Object>> getProductByName(ProductByNameReq req);

    int getProductByNameToTal(ProductByNameReq req);

    Map<String,Object> getProductById(ProductByIdReq req);

    int getMaxNumByProductId(@Param("productId") int productId);

}