package com.sskjdata.wms.mapper;

import com.sskjdata.wms.entity.ProductPicture;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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



}