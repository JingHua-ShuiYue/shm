package com.gm.dao;

import com.gm.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherDao {
    List<Teacher> selectAll();

    Teacher selectByUid(int uid);

    Teacher selectByName(String teacher_name);

    Teacher selectBySubject(String teacher_subject);

    int insert(Teacher teacher);

    int delete(int uid);

    int update(Teacher teacher);
}
