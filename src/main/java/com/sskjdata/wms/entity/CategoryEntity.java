package com.sskjdata.wms.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

/**
 * category
 * 
 * @author guoxinyou
 * @version 1.0.0 2021-01-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryEntity{



    /**
     * categoryId
     */
    @Id
    private Integer categoryId;

    /**
     * categoryName
     */
    private String categoryName;


}