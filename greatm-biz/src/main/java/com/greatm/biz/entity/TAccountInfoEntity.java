package com.greatm.biz.entity;

import java.util.Date;

public class TAccountInfoEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.acco_id
     *
     * @mbg.generated
     */
    private Long accoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.biz_role
     *
     * @mbg.generated
     */
    private Byte bizRole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.star_role
     *
     * @mbg.generated
     */
    private Byte starRole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.user_role
     *
     * @mbg.generated
     */
    private Byte userRole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.first_log
     *
     * @mbg.generated
     */
    private Date firstLog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.last_log
     *
     * @mbg.generated
     */
    private Date lastLog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.wechat
     *
     * @mbg.generated
     */
    private String wechat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.weibo
     *
     * @mbg.generated
     */
    private String weibo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.qq
     *
     * @mbg.generated
     */
    private String qq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_info.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_info
     *
     * @mbg.generated
     */
    public TAccountInfoEntity(Long accoId, Byte bizRole, Byte starRole, Byte userRole, Date firstLog, Date lastLog, String mobile, String password, String wechat, String weibo, String qq, Byte status, Date createTime, Date updateTime) {
        this.accoId = accoId;
        this.bizRole = bizRole;
        this.starRole = starRole;
        this.userRole = userRole;
        this.firstLog = firstLog;
        this.lastLog = lastLog;
        this.mobile = mobile;
        this.password = password;
        this.wechat = wechat;
        this.weibo = weibo;
        this.qq = qq;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_info
     *
     * @mbg.generated
     */
    public TAccountInfoEntity() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.acco_id
     *
     * @return the value of t_account_info.acco_id
     *
     * @mbg.generated
     */
    public Long getAccoId() {
        return accoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.acco_id
     *
     * @param accoId the value for t_account_info.acco_id
     *
     * @mbg.generated
     */
    public void setAccoId(Long accoId) {
        this.accoId = accoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.biz_role
     *
     * @return the value of t_account_info.biz_role
     *
     * @mbg.generated
     */
    public Byte getBizRole() {
        return bizRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.biz_role
     *
     * @param bizRole the value for t_account_info.biz_role
     *
     * @mbg.generated
     */
    public void setBizRole(Byte bizRole) {
        this.bizRole = bizRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.star_role
     *
     * @return the value of t_account_info.star_role
     *
     * @mbg.generated
     */
    public Byte getStarRole() {
        return starRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.star_role
     *
     * @param starRole the value for t_account_info.star_role
     *
     * @mbg.generated
     */
    public void setStarRole(Byte starRole) {
        this.starRole = starRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.user_role
     *
     * @return the value of t_account_info.user_role
     *
     * @mbg.generated
     */
    public Byte getUserRole() {
        return userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.user_role
     *
     * @param userRole the value for t_account_info.user_role
     *
     * @mbg.generated
     */
    public void setUserRole(Byte userRole) {
        this.userRole = userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.first_log
     *
     * @return the value of t_account_info.first_log
     *
     * @mbg.generated
     */
    public Date getFirstLog() {
        return firstLog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.first_log
     *
     * @param firstLog the value for t_account_info.first_log
     *
     * @mbg.generated
     */
    public void setFirstLog(Date firstLog) {
        this.firstLog = firstLog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.last_log
     *
     * @return the value of t_account_info.last_log
     *
     * @mbg.generated
     */
    public Date getLastLog() {
        return lastLog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.last_log
     *
     * @param lastLog the value for t_account_info.last_log
     *
     * @mbg.generated
     */
    public void setLastLog(Date lastLog) {
        this.lastLog = lastLog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.mobile
     *
     * @return the value of t_account_info.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.mobile
     *
     * @param mobile the value for t_account_info.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.password
     *
     * @return the value of t_account_info.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.password
     *
     * @param password the value for t_account_info.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.wechat
     *
     * @return the value of t_account_info.wechat
     *
     * @mbg.generated
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.wechat
     *
     * @param wechat the value for t_account_info.wechat
     *
     * @mbg.generated
     */
    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.weibo
     *
     * @return the value of t_account_info.weibo
     *
     * @mbg.generated
     */
    public String getWeibo() {
        return weibo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.weibo
     *
     * @param weibo the value for t_account_info.weibo
     *
     * @mbg.generated
     */
    public void setWeibo(String weibo) {
        this.weibo = weibo == null ? null : weibo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.qq
     *
     * @return the value of t_account_info.qq
     *
     * @mbg.generated
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.qq
     *
     * @param qq the value for t_account_info.qq
     *
     * @mbg.generated
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.status
     *
     * @return the value of t_account_info.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.status
     *
     * @param status the value for t_account_info.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.create_time
     *
     * @return the value of t_account_info.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.create_time
     *
     * @param createTime the value for t_account_info.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_info.update_time
     *
     * @return the value of t_account_info.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_info.update_time
     *
     * @param updateTime the value for t_account_info.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}