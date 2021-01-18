package com.sskjdata.wms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

/**
 * collect
 * 
 * @author guoxinyou
 * @version 1.0.0 2021-01-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CollectEntity{



    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * userId
     */
    private Integer userId;

    /**
     * productId
     */
    private Integer productId;

    /**
     * collectTime
     */
    private Long collectTime;


}