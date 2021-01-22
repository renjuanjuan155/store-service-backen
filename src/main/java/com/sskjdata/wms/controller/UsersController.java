package com.sskjdata.wms.controller;


import com.sskjdata.wms.dto.LoginReq;
import com.sskjdata.wms.dto.UserByNameReq;
import com.sskjdata.wms.service.UsersService;
import com.sskjdata.wms.vo.R;
import com.sskjdata.wms.vo.in.UsersAddIn;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/8 9:53
 * @Created by ren
 */
@Api(tags = "用户")
@RestController
@RequestMapping(value = "/users")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public R addUser(@RequestBody UsersAddIn param){
        UserByNameReq req = new UserByNameReq();
        req.setUserName(param.getUserName());
        Boolean userByUserName = usersService.getUserByUserName(req);
        if (userByUserName){
            usersService.addUser(param);
            return R.success("注册成功");
        }
        return R.error("用户名已经存在，不能注册");

    }

    /*登录*/
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public R login(@RequestBody LoginReq req){

        List<Map<String, Object>> login = usersService.login(req);
        if (login.size() > 0){

            return R.success(login.get(0)).put("msg","登录成功");
        }
        return R.error("登录失败");
    }

    /*查询是否存在某个用户名,用于注册时前端校验*/
    @PostMapping(value = "findUserName")
    public R findUserName(@RequestBody UserByNameReq req){

        Boolean userByUserName = usersService.getUserByUserName(req);
        if (userByUserName){
            return R.success("用户名不存在，可以注册");
        }
        return R.error("用户名已经存在，不能注册");
    }
}
