package com.greatm.client.model.account;

import java.io.Serializable;

/**
 * @author great-m
 * @since 2017/12/24, 下午9:14
 */
public class LoginUserModel extends BaseResponseModel implements Serializable {

    private long accoid;
    private String name;

    private String imgCode;
    private String deviceId;
    private String registerId;

    public LoginUserModel() {
    }

    public LoginUserModel(String dataStr, String displayError) {
        super(dataStr, displayError);
    }


    public long getAccoid() {
        return accoid;
    }

    public void setAccoid(long accoid) {
        this.accoid = accoid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgCode() {
        return imgCode;
    }

    public void setImgCode(String imgCode) {
        this.imgCode = imgCode;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }
}
