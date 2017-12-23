package com.greatm.biz.taskdao;

import com.greatm.biz.entity.TTaskReleaseEntity;
import com.greatm.biz.entity.TTaskReleaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TTaskReleaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_release
     *
     * @mbg.generated
     */
    long countByExample(TTaskReleaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_release
     *
     * @mbg.generated
     */
    int deleteByExample(TTaskReleaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_release
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_release
     *
     * @mbg.generated
     */
    int insert(TTaskReleaseEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_release
     *
     * @mbg.generated
     */
    int insertSelective(TTaskReleaseEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_release
     *
     * @mbg.generated
     */
    List<TTaskReleaseEntity> selectByExample(TTaskReleaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_release
     *
     * @mbg.generated
     */
    TTaskReleaseEntity selectByPrimaryKey(Long taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_release
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TTaskReleaseEntity record, @Param("example") TTaskReleaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_release
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TTaskReleaseEntity record, @Param("example") TTaskReleaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_release
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TTaskReleaseEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_release
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TTaskReleaseEntity record);
}