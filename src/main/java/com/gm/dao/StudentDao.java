package com.gm.dao;

import com.gm.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentDao {
    /**
     * 查询所有
     * @return
     */
    List<Student> select();

    /**
     * 根据uid查询
     * @return
     */
    Student selectByUid(int uid);

    /**
     * 根据姓名查找学生信息
     * @param student_name
     * @return
     */
    List<Student> selectByName(String student_name);

    /**
     * 添加所选课程
     * @param subject
     * @param uid
     * @return
     */
    int updateSubject(String subject,@Param("uid") int uid);

    /**
     * 删除所选课程
     * @param uid
     * @return
     */
    int deleteSubject(int uid);

}
