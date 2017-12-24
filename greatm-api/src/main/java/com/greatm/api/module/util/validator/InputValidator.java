package com.greatm.api.module.util.validator;

import com.alibaba.fastjson.JSONArray;
import com.greatm.api.module.base.BaseApiModule;
import org.apache.commons.lang.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author great-m
 * @since 2017/12/24, 下午8:33
 */
public class InputValidator {

    public static boolean isInvalidNumberString(String input) {
        return StringUtils.isBlank(input) || !StringUtils.isNumeric(input);
    }

    public static boolean isInvalidMobile(String mobile) {
//        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\\\d{8}$";
//        return StringUtils.isBlank(mobile) || !StringUtils.isNumeric(mobile) || 11 != mobile.length() || !Pattern.compile(regExp).matcher(mobile).matches();
        return StringUtils.isBlank(mobile) || !StringUtils.isNumeric(mobile) || 11 != mobile.length();
    }

    public static boolean isInvalidPassword(String password) {
        return StringUtils.isBlank(password) || password.length() < 8;
    }

    public static boolean isInvalidLoginWithType(String type) {
        return !"wechat".equals(type) && !"weibo".equals(type) && !"qq".equals(type);
    }

    public static boolean isInvalidDateFormat(String dateStr) {
        if (StringUtils.isBlank(dateStr) || !dateStr.contains("-")) {
            return true;
        }
        try {
            DateFormat format = new SimpleDateFormat(BaseApiModule.DATE_FORMAT);
            Date date = format.parse(dateStr);
            if (date != null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return true;
        }
    }

    public static boolean isInvalidDateFormat(String dateStr, String format){
        if (StringUtils.isBlank(dateStr) || !dateStr.contains("-")) {
            return true;
        }
        try {
            DateFormat formatter = new SimpleDateFormat(format);
            Date date = formatter.parse(dateStr);
            if (date != null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return true;
        }
    }

    public static boolean isInvalidTimeFormat(String timeStr) {
        if (StringUtils.isBlank(timeStr) || !timeStr.contains(":")) {
            return true;
        }
        try {
            DateFormat format = new SimpleDateFormat(BaseApiModule.TIME_FORMAT);
            Date date = format.parse(timeStr);
            if (date != null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return true;
        }
    }

    public static boolean isInvalidJSONArrayString(String jsonArrayString) {

        try {
            JSONArray result = JSONArray.parseArray(jsonArrayString);
            if (result != null && result.size() > 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return true;
        }
    }

}
