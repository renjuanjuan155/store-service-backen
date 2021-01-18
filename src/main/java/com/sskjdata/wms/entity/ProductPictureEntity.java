package com.sskjdata.wms.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

/**
 * product_picture
 * 
 * @author guoxinyou
 * @version 1.0.0 2021-01-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPictureEntity{



    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * productId
     */
    private Integer productId;

    /**
     * productPicture
     */
    private String productPicture;

    /**
     * intro
     */
    private String intro;


}