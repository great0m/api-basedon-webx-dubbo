package com.greatm.client.model.account;

import java.io.Serializable;

/**
 * @author great-m
 * @since 2017/12/24, 下午9:17
 */
public class RegisterUserModel implements Serializable {

    private String mobile;
    private String password;

    private String deviceId;
    private String registerId;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
