package com.sskjdata.wms.mapper;

import com.sskjdata.wms.dto.ProductByIdReq;
import com.sskjdata.wms.entity.ProductPicture;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductPictureMapper {
    @Delete({
        "delete from product_picture",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into product_picture (id, product_id, ",
        "product_picture, intro)",
        "values (#{id,jdbcType=INTEGER}, #{productId,jdbcType=INTEGER}, ",
        "#{productPicture,jdbcType=CHAR}, #{intro,jdbcType=LONGVARCHAR})"
    })
    int insert(ProductPicture record);


    List<Map<String , Object>> getProductImgByProductId(ProductByIdReq req);

}