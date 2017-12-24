package com.greatm.client.model.account;

import java.io.Serializable;

/**
 * @author great-m
 * @since 2017/12/24, 下午9:14
 */
public class LoginUserModel extends BaseResponseModel implements Serializable {

    private long accoid;
    private String name;

    private String token;

    private String imgCode;
    private String deviceId;
    private String registerId;

    private String hasSub;


    public LoginUserModel() {
    }

    public LoginUserModel(String dataStr, String displayError) {
        super(dataStr, displayError);
    }

    
}
