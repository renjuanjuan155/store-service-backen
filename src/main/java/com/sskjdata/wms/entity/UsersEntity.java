package com.sskjdata.wms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * users
 * 
 * @author guoxinyou
 * @version 1.0.0 2021-01-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersEntity{



    /**
     * userId
     */

    private Integer userId;

    /**
     * userName
     */
    private String userName;

    /**
     * password
     */
    private String password;

    /**
     * userPhoneNumber
     */
    private String userPhoneNumber;


}