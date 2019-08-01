package com.esta.backoffice.mapper;

import com.esta.backoffice.model.Task;
import com.esta.backoffice.model.TaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_t
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    long countByExample(TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_t
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    int deleteByExample(TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_t
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    int deleteByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_t
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    int insert(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_t
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    int insertSelective(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_t
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    List<Task> selectByExample(TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_t
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    Task selectByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_t
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") Task record, @Param("example") TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_t
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    int updateByExample(@Param("record") Task record, @Param("example") TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_t
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    int updateByPrimaryKeySelective(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_t
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    int updateByPrimaryKey(Task record);
}