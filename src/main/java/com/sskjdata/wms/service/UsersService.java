package com.sskjdata.wms.service;

import com.sskjdata.wms.dto.LoginReq;
import com.sskjdata.wms.dto.UserByNameReq;
import com.sskjdata.wms.entity.UsersEntity;
import com.sskjdata.wms.mapper.UsersMapper;
import com.sskjdata.wms.vo.in.UsersAddIn;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Description
 * @Date 2021/1/8 9:54
 * @Created by meijunjie
 */
@Service
@Log4j2
public class UsersService {

    @Autowired
    private UsersMapper usersMapper;

    /*新增*/
    public void addUser(UsersAddIn param){
        log.info("新增用户");
        UsersEntity users = new UsersEntity();
        BeanUtils.copyProperties(param,users);
        usersMapper.insert(users);
    }

    /*登录*/
    public Boolean login(LoginReq req){

        int login = usersMapper.login(req);
        if (login>0){
            return true;
        }
        return false;
    }

    /*根据用户名称查询用户*/
    public Boolean getUserByUserName(UserByNameReq req){
        int userByUserName = usersMapper.getUserByUserName(req);
        if (userByUserName > 0){
            return false;
        }
        return true;
    }

}
