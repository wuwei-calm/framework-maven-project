package com.framework.test.dao;

import com.framework.test.model.test;
import com.framework.test.model.testExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface testMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Sep 16 10:35:58 CST 2017
     */
    long countByExample(testExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Sep 16 10:35:58 CST 2017
     */
    int deleteByExample(testExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Sep 16 10:35:58 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Sep 16 10:35:58 CST 2017
     */
    int insert(test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Sep 16 10:35:58 CST 2017
     */
    int insertSelective(test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Sep 16 10:35:58 CST 2017
     */
    List<test> selectByExample(testExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Sep 16 10:35:58 CST 2017
     */
    test selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Sep 16 10:35:58 CST 2017
     */
    int updateByExampleSelective(@Param("record") test record, @Param("example") testExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Sep 16 10:35:58 CST 2017
     */
    int updateByExample(@Param("record") test record, @Param("example") testExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Sep 16 10:35:58 CST 2017
     */
    int updateByPrimaryKeySelective(test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Sep 16 10:35:58 CST 2017
     */
    int updateByPrimaryKey(test record);
}