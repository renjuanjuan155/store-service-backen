package com.sskjdata.wms.mapper;

import com.sskjdata.wms.entity.CollectEntity;
import org.apache.ibatis.annotations.*;

public interface CollectMapper {


    @Insert({
        "insert into collect (id, user_id, ",
        "product_id, collect_time)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{productId,jdbcType=INTEGER}, #{collectTime,jdbcType=BIGINT})"
    })
    int insert(CollectEntity record);


}