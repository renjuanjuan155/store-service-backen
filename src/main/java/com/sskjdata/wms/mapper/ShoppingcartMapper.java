package com.sskjdata.wms.mapper;

import com.sskjdata.wms.dto.ShoppingcartDeleteReq;
import com.sskjdata.wms.dto.ShoppingcartUpdateReq;
import com.sskjdata.wms.dto.UserByIdReq;
import com.sskjdata.wms.entity.ShoppingcartEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
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


    List<Map<String,Object>> getShoppingByUserId(UserByIdReq req);

    void deleteByUserIdAndProductId(ShoppingcartDeleteReq req);

    List<Map<String,Object>> getCartByUserIdAndProductId(ShoppingcartEntity req);

    void updateShoppingcart(ShoppingcartUpdateReq req);
}