package com.sskjdata.wms.mapper;

import com.sskjdata.wms.entity.OrdersEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrdersMapper {

    @Insert({
        "insert into orders (id, order_id, ",
        "user_id, product_id, ",
        "product_num, product_price, ",
        "order_time)",
        "values (#{id,jdbcType=INTEGER}, #{orderId,jdbcType=BIGINT}, ",
        "#{userId,jdbcType=INTEGER}, #{productId,jdbcType=INTEGER}, ",
        "#{productNum,jdbcType=INTEGER}, #{productPrice,jdbcType=DOUBLE}, ",
        "#{orderTime,jdbcType=BIGINT})"
    })
    int insert(OrdersEntity record);


    List<Map<String, Object>> getOrdersByUserId(@Param("userId") int userId);
}