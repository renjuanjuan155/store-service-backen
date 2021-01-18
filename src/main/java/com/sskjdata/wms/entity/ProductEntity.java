package com.sskjdata.wms.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

/**
 * product
 * 
 * @author guoxinyou
 * @version 1.0.0 2021-01-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductEntity{



    /**
     * productId
     */
    @Id
    private Integer productId;

    /**
     * productName
     */
    private String productName;

    /**
     * categoryId
     */
    private Integer categoryId;

    /**
     * productTitle
     */
    private String productTitle;

    /**
     * productIntro
     */
    private String productIntro;

    /**
     * productPicture
     */
    private String productPicture;

    /**
     * productPrice
     */
    private Double productPrice;

    /**
     * productSellingPrice
     */
    private Double productSellingPrice;

    /**
     * productNum
     */
    private Integer productNum;

    /**
     * productSales
     */
    private Integer productSales;


}