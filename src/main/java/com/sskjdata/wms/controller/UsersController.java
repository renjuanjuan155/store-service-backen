package com.sskjdata.wms.controller;


import com.sskjdata.wms.service.UsersService;
import com.sskjdata.wms.vo.in.UsersAddIn;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addUser(@RequestBody UsersAddIn param){
        usersService.addUser(param);
    }
}
