package com.sskjdata.wms.controller;

import com.sskjdata.wms.vo.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Date 2021/1/15 16:16
 * @Created by meijunjie
 */
@RestController
@RequestMapping("/")
public class ShoppingCartController {

    @PostMapping(value = "/getAllProduct")
    public R getAllProduct(){
        return new R();
    }
}
