package com.greatm.api.module.util.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author great-m
 * @since 2017/12/24, 下午9:25
 */
public class DateHelper {

    private static final String DATE_FORMAT = "yyyy-MM-dd";
    private static final String ZHMONTH_FORMAT = "MM月dd日";
    private static final String TIME_FORMAT = "HH:mm";

    public static int countAge(Date birthday) {
        if (birthday == null) {
            return 0;
        }

        Calendar cal = Calendar.getInstance();
        if (cal.before(birthday)) {
            return 0;
        }

        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH) + 1;
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthday);

        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                //monthNow==monthBirth
                if (dayOfMonthNow < dayOfMonthBirth) {
                    age--;
                } else {
                    //do nothing
                }
            } else {
                //monthNow>monthBirth
                age--;
            }
        } else {
            //monthNow<monthBirth
            //donothing
        }

        return age;
    }

    public static String convert2Timestamp(Date date) {
        if (date == null) {
            return "";
        }
        return String.valueOf(date.getTime());
    }

    public static String extractDateString(Date date) {
        if (null == date) {
            return "";
        }
        SimpleDateFormat formater = new SimpleDateFormat(DATE_FORMAT);
        return formater.format(date);
    }

    public static String extractTimeString(Date date) {
        if (null == date) {
            return "";
        }
        SimpleDateFormat formater = new SimpleDateFormat(TIME_FORMAT);
        return formater.format(date);
    }

    public static String extractZhMonthString(Date date) {
        SimpleDateFormat formater = new SimpleDateFormat(ZHMONTH_FORMAT);
        return formater.format(date);
    }

    public static void main(String[] args) {
        System.out.println(extractDateString(new Date()));
        System.out.println(extractTimeString(new Date()));
        System.out.println(extractZhMonthString(new Date()));
    }

    public static boolean isOverTime(Date date1, Date date2, long maxTimeRange) {
        long timeRange = Math.abs(date1.getTime() - date2.getTime());
        return timeRange > maxTimeRange;
    }

    public static Date calDateBeforeOnMinute(Date targetDate, int minuteCount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(targetDate);
        calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE) - minuteCount);
        return calendar.getTime();
    }

    public static Date calDateAfterOnMinute(Date targetDate, int minuteCount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(targetDate);
        calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE) + minuteCount);
        return calendar.getTime();
    }

    public static Date calDateAfterOnHour(Date targetDate, int hour) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(targetDate);
        calendar.set(Calendar.HOUR, calendar.get(Calendar.HOUR) + hour);
        return calendar.getTime();
    }

    public static Date calDateBeforeOnHour(Date targetDate, int hourCount) {
        Calendar targetCalendar = Calendar.getInstance();
        targetCalendar.setTime(targetDate);
        targetCalendar.set(Calendar.HOUR, targetCalendar.get(Calendar.HOUR) - hourCount);
        return targetCalendar.getTime();
    }

    public static Date calDateBeforeOnDay(Date targetDate, int dayCount) {
        Calendar targetCalendar = Calendar.getInstance();
        targetCalendar.setTime(targetDate);
        targetCalendar.set(Calendar.DATE, targetCalendar.get(Calendar.DATE) - dayCount);
        return targetCalendar.getTime();
    }

    public static Date calDateAfterOnDay(Date targetDate, int dayCount) {
        Calendar targetCalendar = Calendar.getInstance();
        targetCalendar.setTime(targetDate);
        targetCalendar.set(Calendar.DATE, targetCalendar.get(Calendar.DATE) + dayCount);
        return targetCalendar.getTime();
    }

    public static long getTimeMillis(Date date1, Date date2) {
        return Math.abs(date1.getTime() - date2.getTime());
    }

    public static boolean isSameDay(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)
                && cal1.get(Calendar.DATE) == cal2.get(Calendar.DATE);
    }

    /**
     * set the millisecond as a fixed value
     */
    public static Date freezeMillSecond(Date targetDate, int millSecond) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(targetDate);
        calendar.set(Calendar.MILLISECOND, millSecond);
        return calendar.getTime();
    }
}
