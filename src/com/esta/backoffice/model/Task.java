package com.esta.backoffice.model;

import java.util.Date;

public class Task {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_t.task_id
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    private Integer taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_t.administrator_id
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    private Integer administratorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_t.task_time
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    private Date taskTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_t.competition_name
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    private String competitionName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_t.task_type
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    private String taskType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_t.task_stu_num
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    private Integer taskStuNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_t.task_teacher_num
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    private Integer taskTeacherNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_t.joined_num
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    private Integer joinedNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_t.close_time
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    private Date closeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_t.is_close
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    private String isClose;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_t.task_id
     *
     * @return the value of task_t.task_id
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_t.task_id
     *
     * @param taskId the value for task_t.task_id
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_t.administrator_id
     *
     * @return the value of task_t.administrator_id
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public Integer getAdministratorId() {
        return administratorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_t.administrator_id
     *
     * @param administratorId the value for task_t.administrator_id
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_t.task_time
     *
     * @return the value of task_t.task_time
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public Date getTaskTime() {
        return taskTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_t.task_time
     *
     * @param taskTime the value for task_t.task_time
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public void setTaskTime(Date taskTime) {
        this.taskTime = taskTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_t.competition_name
     *
     * @return the value of task_t.competition_name
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public String getCompetitionName() {
        return competitionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_t.competition_name
     *
     * @param competitionName the value for task_t.competition_name
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName == null ? null : competitionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_t.task_type
     *
     * @return the value of task_t.task_type
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_t.task_type
     *
     * @param taskType the value for task_t.task_type
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_t.task_stu_num
     *
     * @return the value of task_t.task_stu_num
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public Integer getTaskStuNum() {
        return taskStuNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_t.task_stu_num
     *
     * @param taskStuNum the value for task_t.task_stu_num
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public void setTaskStuNum(Integer taskStuNum) {
        this.taskStuNum = taskStuNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_t.task_teacher_num
     *
     * @return the value of task_t.task_teacher_num
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public Integer getTaskTeacherNum() {
        return taskTeacherNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_t.task_teacher_num
     *
     * @param taskTeacherNum the value for task_t.task_teacher_num
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public void setTaskTeacherNum(Integer taskTeacherNum) {
        this.taskTeacherNum = taskTeacherNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_t.joined_num
     *
     * @return the value of task_t.joined_num
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public Integer getJoinedNum() {
        return joinedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_t.joined_num
     *
     * @param joinedNum the value for task_t.joined_num
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public void setJoinedNum(Integer joinedNum) {
        this.joinedNum = joinedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_t.close_time
     *
     * @return the value of task_t.close_time
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_t.close_time
     *
     * @param closeTime the value for task_t.close_time
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_t.is_close
     *
     * @return the value of task_t.is_close
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public String getIsClose() {
        return isClose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_t.is_close
     *
     * @param isClose the value for task_t.is_close
     *
     * @mbg.generated Tue Jul 30 22:09:10 CST 2019
     */
    public void setIsClose(String isClose) {
        this.isClose = isClose == null ? null : isClose.trim();
    }
}