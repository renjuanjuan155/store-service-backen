package com.sskjdata.wms.mapper;

import com.sskjdata.wms.entity.ShoppingcartEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface ShoppingcartMapper {
    @Delete({
        "delete from shoppingcart",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into shoppingcart (id, user_id, ",
        "product_id, num)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{productId,jdbcType=INTEGER}, #{num,jdbcType=INTEGER})"
    })
    int insert(ShoppingcartEntity record);


}