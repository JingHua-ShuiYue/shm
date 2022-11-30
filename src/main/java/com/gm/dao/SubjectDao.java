package com.gm.dao;

import com.gm.pojo.Subject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SubjectDao {
    /**
     * 获取全部的课程信息
     * @return
     */
    List<Subject> selectAll();

    /**
     * 根据id查询课程信息
     * @param id
     * @return
     */
    Subject selectById(int id);

    /**
     * 根据科目查询信息
     * @param subject
     * @return
     */
    Subject selectBySubject(String subject);

    /**
     * 根据教师查询课程
     * @param teacherName
     * @return
     */
    Subject selectByTeacher(String teacherName);

    /**
     * 添加新课程
     * @param subject
     * @return
     */
    int insertSubject(Subject subject);

    /**
     * 更新课程信息
     * @param subject
     * @return
     */
    int updateSubject(Subject subject);

    /**
     * 根据id删除课程
     * @param id
     * @return
     */
    int deleteSubjectById(int id);


}
