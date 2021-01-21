package com.sskjdata.wms.mapper;

import com.sskjdata.wms.dto.CollectAddReq;
import com.sskjdata.wms.dto.UserByIdReq;
import com.sskjdata.wms.entity.CollectEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface CollectMapper {


    @Insert({
        "insert into collect (id, user_id, ",
        "product_id, collect_time)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{productId,jdbcType=INTEGER}, #{collectTime,jdbcType=BIGINT})"
    })
    int insert(CollectEntity record);

    int getCollectByUserIdAndProduct(CollectAddReq req);

    List<Map<String,Object>> getCollectProducrByUserId(UserByIdReq req);

    void deleteById(CollectAddReq req);

}