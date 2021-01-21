package com.sskjdata.wms.service;

import com.sskjdata.wms.dto.CollectAddReq;
import com.sskjdata.wms.dto.UserByIdReq;
import com.sskjdata.wms.entity.CollectEntity;
import com.sskjdata.wms.mapper.CollectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/1/20 16:19
 * @Created by meijunjie
 */
@Service
public class CollectService {

    @Autowired
    private CollectMapper collectMapper;

    public Boolean insert(CollectAddReq req){
        int collectByUserIdAndProduct = collectMapper.getCollectByUserIdAndProduct(req);
        if (collectByUserIdAndProduct == 0){
            CollectEntity collectEntity = new CollectEntity();
            collectEntity.setUserId(req.getUserId());
            collectEntity.setProductId(req.getProductId());
            collectEntity.setCollectTime(new Date().getTime());
            collectMapper.insert(collectEntity);
            return true;
        }else {
            return false;
        }
    }

    public Boolean getCollectByUserIdAndProduct(CollectAddReq req){
        int collectByUserIdAndProduct = collectMapper.getCollectByUserIdAndProduct(req);
        if (collectByUserIdAndProduct == 0){
            return true;
        }else {
            return false;
        }
    }

    public List<Map<String,Object>> getCollectProducrByUserId(UserByIdReq req){
        List<Map<String, Object>> collectProducrByUserId = collectMapper.getCollectProducrByUserId(req);
        return collectProducrByUserId;
    }

    public Boolean delete(CollectAddReq req){
        //判断是否有
        int collectByUserIdAndProduct = collectMapper.getCollectByUserIdAndProduct(req);
        if (collectByUserIdAndProduct >0){
            collectMapper.deleteById(req);
            return true;
        }
        return false;
    }

}
