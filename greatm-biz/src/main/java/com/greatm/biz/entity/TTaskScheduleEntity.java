package com.greatm.biz.entity;

import java.util.Date;

public class TTaskScheduleEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.task_id
     *
     * @mbg.generated
     */
    private Long taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.apply_count
     *
     * @mbg.generated
     */
    private Integer applyCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.hired_id
     *
     * @mbg.generated
     */
    private Long hiredId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.hired_name
     *
     * @mbg.generated
     */
    private String hiredName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.hired_time
     *
     * @mbg.generated
     */
    private Date hiredTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.task_status
     *
     * @mbg.generated
     */
    private Byte taskStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.pay_status
     *
     * @mbg.generated
     */
    private Byte payStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.complain_status
     *
     * @mbg.generated
     */
    private Byte complainStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.review_status
     *
     * @mbg.generated
     */
    private Byte reviewStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.audi_status
     *
     * @mbg.generated
     */
    private Byte audiStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.audi_over_reason
     *
     * @mbg.generated
     */
    private String audiOverReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.audi_time
     *
     * @mbg.generated
     */
    private Date audiTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.audi_id
     *
     * @mbg.generated
     */
    private Long audiId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.complete_time
     *
     * @mbg.generated
     */
    private Date completeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.complete_accoid
     *
     * @mbg.generated
     */
    private Long completeAccoid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.cancel_time
     *
     * @mbg.generated
     */
    private Date cancelTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.cancel_accoid
     *
     * @mbg.generated
     */
    private Long cancelAccoid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.cancel_reason
     *
     * @mbg.generated
     */
    private String cancelReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_schedule.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_schedule
     *
     * @mbg.generated
     */
    public TTaskScheduleEntity(Long taskId, Integer applyCount, Long hiredId, String hiredName, Date hiredTime, Byte taskStatus, Byte payStatus, Byte complainStatus, Byte reviewStatus, Byte audiStatus, String audiOverReason, Date audiTime, Long audiId, Date completeTime, Long completeAccoid, Date cancelTime, Long cancelAccoid, String cancelReason, Date createTime, Date updateTime) {
        this.taskId = taskId;
        this.applyCount = applyCount;
        this.hiredId = hiredId;
        this.hiredName = hiredName;
        this.hiredTime = hiredTime;
        this.taskStatus = taskStatus;
        this.payStatus = payStatus;
        this.complainStatus = complainStatus;
        this.reviewStatus = reviewStatus;
        this.audiStatus = audiStatus;
        this.audiOverReason = audiOverReason;
        this.audiTime = audiTime;
        this.audiId = audiId;
        this.completeTime = completeTime;
        this.completeAccoid = completeAccoid;
        this.cancelTime = cancelTime;
        this.cancelAccoid = cancelAccoid;
        this.cancelReason = cancelReason;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_schedule
     *
     * @mbg.generated
     */
    public TTaskScheduleEntity() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.task_id
     *
     * @return the value of t_task_schedule.task_id
     *
     * @mbg.generated
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.task_id
     *
     * @param taskId the value for t_task_schedule.task_id
     *
     * @mbg.generated
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.apply_count
     *
     * @return the value of t_task_schedule.apply_count
     *
     * @mbg.generated
     */
    public Integer getApplyCount() {
        return applyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.apply_count
     *
     * @param applyCount the value for t_task_schedule.apply_count
     *
     * @mbg.generated
     */
    public void setApplyCount(Integer applyCount) {
        this.applyCount = applyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.hired_id
     *
     * @return the value of t_task_schedule.hired_id
     *
     * @mbg.generated
     */
    public Long getHiredId() {
        return hiredId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.hired_id
     *
     * @param hiredId the value for t_task_schedule.hired_id
     *
     * @mbg.generated
     */
    public void setHiredId(Long hiredId) {
        this.hiredId = hiredId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.hired_name
     *
     * @return the value of t_task_schedule.hired_name
     *
     * @mbg.generated
     */
    public String getHiredName() {
        return hiredName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.hired_name
     *
     * @param hiredName the value for t_task_schedule.hired_name
     *
     * @mbg.generated
     */
    public void setHiredName(String hiredName) {
        this.hiredName = hiredName == null ? null : hiredName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.hired_time
     *
     * @return the value of t_task_schedule.hired_time
     *
     * @mbg.generated
     */
    public Date getHiredTime() {
        return hiredTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.hired_time
     *
     * @param hiredTime the value for t_task_schedule.hired_time
     *
     * @mbg.generated
     */
    public void setHiredTime(Date hiredTime) {
        this.hiredTime = hiredTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.task_status
     *
     * @return the value of t_task_schedule.task_status
     *
     * @mbg.generated
     */
    public Byte getTaskStatus() {
        return taskStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.task_status
     *
     * @param taskStatus the value for t_task_schedule.task_status
     *
     * @mbg.generated
     */
    public void setTaskStatus(Byte taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.pay_status
     *
     * @return the value of t_task_schedule.pay_status
     *
     * @mbg.generated
     */
    public Byte getPayStatus() {
        return payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.pay_status
     *
     * @param payStatus the value for t_task_schedule.pay_status
     *
     * @mbg.generated
     */
    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.complain_status
     *
     * @return the value of t_task_schedule.complain_status
     *
     * @mbg.generated
     */
    public Byte getComplainStatus() {
        return complainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.complain_status
     *
     * @param complainStatus the value for t_task_schedule.complain_status
     *
     * @mbg.generated
     */
    public void setComplainStatus(Byte complainStatus) {
        this.complainStatus = complainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.review_status
     *
     * @return the value of t_task_schedule.review_status
     *
     * @mbg.generated
     */
    public Byte getReviewStatus() {
        return reviewStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.review_status
     *
     * @param reviewStatus the value for t_task_schedule.review_status
     *
     * @mbg.generated
     */
    public void setReviewStatus(Byte reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.audi_status
     *
     * @return the value of t_task_schedule.audi_status
     *
     * @mbg.generated
     */
    public Byte getAudiStatus() {
        return audiStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.audi_status
     *
     * @param audiStatus the value for t_task_schedule.audi_status
     *
     * @mbg.generated
     */
    public void setAudiStatus(Byte audiStatus) {
        this.audiStatus = audiStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.audi_over_reason
     *
     * @return the value of t_task_schedule.audi_over_reason
     *
     * @mbg.generated
     */
    public String getAudiOverReason() {
        return audiOverReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.audi_over_reason
     *
     * @param audiOverReason the value for t_task_schedule.audi_over_reason
     *
     * @mbg.generated
     */
    public void setAudiOverReason(String audiOverReason) {
        this.audiOverReason = audiOverReason == null ? null : audiOverReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.audi_time
     *
     * @return the value of t_task_schedule.audi_time
     *
     * @mbg.generated
     */
    public Date getAudiTime() {
        return audiTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.audi_time
     *
     * @param audiTime the value for t_task_schedule.audi_time
     *
     * @mbg.generated
     */
    public void setAudiTime(Date audiTime) {
        this.audiTime = audiTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.audi_id
     *
     * @return the value of t_task_schedule.audi_id
     *
     * @mbg.generated
     */
    public Long getAudiId() {
        return audiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.audi_id
     *
     * @param audiId the value for t_task_schedule.audi_id
     *
     * @mbg.generated
     */
    public void setAudiId(Long audiId) {
        this.audiId = audiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.complete_time
     *
     * @return the value of t_task_schedule.complete_time
     *
     * @mbg.generated
     */
    public Date getCompleteTime() {
        return completeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.complete_time
     *
     * @param completeTime the value for t_task_schedule.complete_time
     *
     * @mbg.generated
     */
    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.complete_accoid
     *
     * @return the value of t_task_schedule.complete_accoid
     *
     * @mbg.generated
     */
    public Long getCompleteAccoid() {
        return completeAccoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.complete_accoid
     *
     * @param completeAccoid the value for t_task_schedule.complete_accoid
     *
     * @mbg.generated
     */
    public void setCompleteAccoid(Long completeAccoid) {
        this.completeAccoid = completeAccoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.cancel_time
     *
     * @return the value of t_task_schedule.cancel_time
     *
     * @mbg.generated
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.cancel_time
     *
     * @param cancelTime the value for t_task_schedule.cancel_time
     *
     * @mbg.generated
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.cancel_accoid
     *
     * @return the value of t_task_schedule.cancel_accoid
     *
     * @mbg.generated
     */
    public Long getCancelAccoid() {
        return cancelAccoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.cancel_accoid
     *
     * @param cancelAccoid the value for t_task_schedule.cancel_accoid
     *
     * @mbg.generated
     */
    public void setCancelAccoid(Long cancelAccoid) {
        this.cancelAccoid = cancelAccoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.cancel_reason
     *
     * @return the value of t_task_schedule.cancel_reason
     *
     * @mbg.generated
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.cancel_reason
     *
     * @param cancelReason the value for t_task_schedule.cancel_reason
     *
     * @mbg.generated
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.create_time
     *
     * @return the value of t_task_schedule.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.create_time
     *
     * @param createTime the value for t_task_schedule.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_schedule.update_time
     *
     * @return the value of t_task_schedule.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_schedule.update_time
     *
     * @param updateTime the value for t_task_schedule.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}