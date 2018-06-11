package com.oneapm.atomikos.a.mapper;

import com.oneapm.atomikos.a.domain.TblA;
import com.oneapm.atomikos.a.domain.TblACriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblAMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_a
     * @mbggenerated
     */
    int countByExample(TblACriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_a
     * @mbggenerated
     */
    int deleteByExample(TblACriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_a
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer a1);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_a
     * @mbggenerated
     */
    int insert(TblA record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_a
     * @mbggenerated
     */
    int insertSelective(TblA record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_a
     * @mbggenerated
     */
    List<TblA> selectByExample(TblACriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_a
     * @mbggenerated
     */
    TblA selectByPrimaryKey(Integer a1);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_a
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TblA record, @Param("example") TblACriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_a
     * @mbggenerated
     */
    int updateByExample(@Param("record") TblA record, @Param("example") TblACriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_a
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TblA record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_a
     * @mbggenerated
     */
    int updateByPrimaryKey(TblA record);
}