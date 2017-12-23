package com.greatm.biz.accountdao;

import com.greatm.biz.entity.TAccountInfoEntity;
import com.greatm.biz.entity.TAccountInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TAccountInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_info
     *
     * @mbg.generated
     */
    long countByExample(TAccountInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_info
     *
     * @mbg.generated
     */
    int deleteByExample(TAccountInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long accoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_info
     *
     * @mbg.generated
     */
    int insert(TAccountInfoEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_info
     *
     * @mbg.generated
     */
    int insertSelective(TAccountInfoEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_info
     *
     * @mbg.generated
     */
    List<TAccountInfoEntity> selectByExample(TAccountInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_info
     *
     * @mbg.generated
     */
    TAccountInfoEntity selectByPrimaryKey(Long accoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TAccountInfoEntity record, @Param("example") TAccountInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TAccountInfoEntity record, @Param("example") TAccountInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TAccountInfoEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TAccountInfoEntity record);
}