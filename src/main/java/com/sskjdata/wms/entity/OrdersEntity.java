package com.sskjdata.wms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

/**
 * orders
 * 
 * @author guoxinyou
 * @version 1.0.0 2021-01-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrdersEntity{



    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * orderId
     */
    private Long orderId;

    /**
     * userId
     */
    private Integer userId;

    /**
     * productId
     */
    private Integer productId;

    /**
     * productNum
     */
    private Integer productNum;

    /**
     * productPrice
     */
    private Double productPrice;

    /**
     * orderTime
     */
    private Long orderTime;


}