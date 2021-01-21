package com.sskjdata.wms.controller;

import com.sskjdata.wms.vo.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Date 2021/1/21 10:26
 * @Created by meijunjie
 */
@RestController
@RequestMapping("/")
public class ProductPictureController {

    @GetMapping("/")
    public void getPicture(){

    }
}
