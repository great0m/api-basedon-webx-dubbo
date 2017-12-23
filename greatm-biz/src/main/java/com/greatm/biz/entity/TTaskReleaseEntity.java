package com.greatm.biz.entity;

import java.util.Date;

public class TTaskReleaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.task_id
     *
     * @mbg.generated
     */
    private Long taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.acco_id
     *
     * @mbg.generated
     */
    private Long accoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.owner_name
     *
     * @mbg.generated
     */
    private String ownerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.owner_pic
     *
     * @mbg.generated
     */
    private String ownerPic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.city_id
     *
     * @mbg.generated
     */
    private Long cityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.gender
     *
     * @mbg.generated
     */
    private Byte gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.hire_count
     *
     * @mbg.generated
     */
    private Integer hireCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.payment
     *
     * @mbg.generated
     */
    private Long payment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.cate_id
     *
     * @mbg.generated
     */
    private String cateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.cate_tag
     *
     * @mbg.generated
     */
    private String cateTag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.task_pass
     *
     * @mbg.generated
     */
    private String taskPass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_task_release.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_release
     *
     * @mbg.generated
     */
    public TTaskReleaseEntity(Long taskId, Long accoId, String ownerName, String ownerPic, Long cityId, Date startTime, Date endTime, String title, String content, String description, Byte gender, Integer hireCount, Long payment, String cateId, String cateTag, String taskPass, Date createTime, Date updateTime) {
        this.taskId = taskId;
        this.accoId = accoId;
        this.ownerName = ownerName;
        this.ownerPic = ownerPic;
        this.cityId = cityId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.title = title;
        this.content = content;
        this.description = description;
        this.gender = gender;
        this.hireCount = hireCount;
        this.payment = payment;
        this.cateId = cateId;
        this.cateTag = cateTag;
        this.taskPass = taskPass;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_release
     *
     * @mbg.generated
     */
    public TTaskReleaseEntity() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.task_id
     *
     * @return the value of t_task_release.task_id
     *
     * @mbg.generated
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.task_id
     *
     * @param taskId the value for t_task_release.task_id
     *
     * @mbg.generated
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.acco_id
     *
     * @return the value of t_task_release.acco_id
     *
     * @mbg.generated
     */
    public Long getAccoId() {
        return accoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.acco_id
     *
     * @param accoId the value for t_task_release.acco_id
     *
     * @mbg.generated
     */
    public void setAccoId(Long accoId) {
        this.accoId = accoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.owner_name
     *
     * @return the value of t_task_release.owner_name
     *
     * @mbg.generated
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.owner_name
     *
     * @param ownerName the value for t_task_release.owner_name
     *
     * @mbg.generated
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.owner_pic
     *
     * @return the value of t_task_release.owner_pic
     *
     * @mbg.generated
     */
    public String getOwnerPic() {
        return ownerPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.owner_pic
     *
     * @param ownerPic the value for t_task_release.owner_pic
     *
     * @mbg.generated
     */
    public void setOwnerPic(String ownerPic) {
        this.ownerPic = ownerPic == null ? null : ownerPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.city_id
     *
     * @return the value of t_task_release.city_id
     *
     * @mbg.generated
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.city_id
     *
     * @param cityId the value for t_task_release.city_id
     *
     * @mbg.generated
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.start_time
     *
     * @return the value of t_task_release.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.start_time
     *
     * @param startTime the value for t_task_release.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.end_time
     *
     * @return the value of t_task_release.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.end_time
     *
     * @param endTime the value for t_task_release.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.title
     *
     * @return the value of t_task_release.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.title
     *
     * @param title the value for t_task_release.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.content
     *
     * @return the value of t_task_release.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.content
     *
     * @param content the value for t_task_release.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.description
     *
     * @return the value of t_task_release.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.description
     *
     * @param description the value for t_task_release.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.gender
     *
     * @return the value of t_task_release.gender
     *
     * @mbg.generated
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.gender
     *
     * @param gender the value for t_task_release.gender
     *
     * @mbg.generated
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.hire_count
     *
     * @return the value of t_task_release.hire_count
     *
     * @mbg.generated
     */
    public Integer getHireCount() {
        return hireCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.hire_count
     *
     * @param hireCount the value for t_task_release.hire_count
     *
     * @mbg.generated
     */
    public void setHireCount(Integer hireCount) {
        this.hireCount = hireCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.payment
     *
     * @return the value of t_task_release.payment
     *
     * @mbg.generated
     */
    public Long getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.payment
     *
     * @param payment the value for t_task_release.payment
     *
     * @mbg.generated
     */
    public void setPayment(Long payment) {
        this.payment = payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.cate_id
     *
     * @return the value of t_task_release.cate_id
     *
     * @mbg.generated
     */
    public String getCateId() {
        return cateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.cate_id
     *
     * @param cateId the value for t_task_release.cate_id
     *
     * @mbg.generated
     */
    public void setCateId(String cateId) {
        this.cateId = cateId == null ? null : cateId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.cate_tag
     *
     * @return the value of t_task_release.cate_tag
     *
     * @mbg.generated
     */
    public String getCateTag() {
        return cateTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.cate_tag
     *
     * @param cateTag the value for t_task_release.cate_tag
     *
     * @mbg.generated
     */
    public void setCateTag(String cateTag) {
        this.cateTag = cateTag == null ? null : cateTag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.task_pass
     *
     * @return the value of t_task_release.task_pass
     *
     * @mbg.generated
     */
    public String getTaskPass() {
        return taskPass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.task_pass
     *
     * @param taskPass the value for t_task_release.task_pass
     *
     * @mbg.generated
     */
    public void setTaskPass(String taskPass) {
        this.taskPass = taskPass == null ? null : taskPass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.create_time
     *
     * @return the value of t_task_release.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.create_time
     *
     * @param createTime the value for t_task_release.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_task_release.update_time
     *
     * @return the value of t_task_release.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_task_release.update_time
     *
     * @param updateTime the value for t_task_release.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}