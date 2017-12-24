package com.greatm.client.model.account;

import java.io.Serializable;
import java.util.Map;

/**
 * @author great-m
 * @since 2017/12/24, 下午9:14
 */
public class BaseResponseModel implements Serializable{

    private String displayErrorMessage;
    private String dataStr;
    private int dataInt;
    private long dataLong;
    private Object data;
    private Map map;

    public BaseResponseModel(){}

    public BaseResponseModel(long dataLong) {
        this.dataLong = dataLong;
    }
    public BaseResponseModel(int dataInt) {
        this.dataInt = dataInt;
    }

    public BaseResponseModel(String dataStr, String displayErrorMessage) {
        this.dataStr = dataStr;
        this.displayErrorMessage = displayErrorMessage;
    }

    public String getDisplayErrorMessage() {
        return displayErrorMessage;
    }

    public void setDisplayErrorMessage(String displayErrorMessage) {
        this.displayErrorMessage = displayErrorMessage;
    }

    public String getDataStr() {
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }

    public int getDataInt() {
        return dataInt;
    }

    public void setDataInt(int dataInt) {
        this.dataInt = dataInt;
    }

    public long getDataLong() {
        return dataLong;
    }

    public void setDataLong(long dataLong) {
        this.dataLong = dataLong;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
