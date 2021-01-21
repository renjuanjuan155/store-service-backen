package com.sskjdata.wms.controller;

import com.sskjdata.wms.dto.CollectAddReq;
import com.sskjdata.wms.dto.UserByIdReq;
import com.sskjdata.wms.service.CollectService;
import com.sskjdata.wms.vo.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/20 15:38
 * @Created by meijunjie
 */
@RestController
@RequestMapping("/collect")
@Api(tags = "收藏商品")
public class CollectController {

    @Autowired
    private CollectService collectService;

    /*添加收藏*/
    @RequestMapping(value = "/addCollect",method = RequestMethod.POST)
    public R AddCollect(@RequestBody CollectAddReq req){

        //检验用户是否登录

        //判断是否已经收藏过了
        Boolean collectByUserIdAndProduct = collectService.getCollectByUserIdAndProduct(req);
        if ( !collectByUserIdAndProduct){
            return R.success("该商品已经添加收藏，请到我的收藏查看").setCode("003");
        }
        Boolean insert = collectService.insert(req);
        if (insert){
            return R.success("添加收藏成功");
        }
        return R.error("添加收藏失败").setCode("002");
    }

    /*获取用户的所有收藏商品信息*/
    @PostMapping(value = "getCollect")
    public R getCollect(@RequestBody UserByIdReq req){
        //判断用户是否登录

        //查询
        List<Map<String, Object>> collectProducrByUserId = collectService.getCollectProducrByUserId(req);
        return R.success(collectProducrByUserId);
    }

    /*删除用户的收藏信息*/
    @PostMapping(value = "deleteCollect")
    public R deleteCollect(@RequestBody CollectAddReq req){
        Boolean delete = collectService.delete(req);
        if (delete){
            return R.success("删除收藏成功");
        }
        return R.success("该商品不在收藏列表").setCode("002");
    }
}
