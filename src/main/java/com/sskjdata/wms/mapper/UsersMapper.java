package com.sskjdata.wms.mapper;

import com.sskjdata.wms.entity.UsersEntity;
import org.apache.ibatis.annotations.*;


@Mapper
public interface UsersMapper {
    @Delete({
        "delete from users",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    @Insert({
        "insert into users (userName, ",
        "password, userPhoneNumber)",
        "values ( #{userName,jdbcType=CHAR}, ",
        "#{password,jdbcType=CHAR}, #{userPhoneNumber,jdbcType=CHAR})"
    })
    int insert(UsersEntity record);


    @Update({
        "update users",
        "set userName = #{username,jdbcType=CHAR},",
          "password = #{password,jdbcType=CHAR},",
          "userPhoneNumber = #{userphonenumber,jdbcType=CHAR}",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UsersEntity record);
}