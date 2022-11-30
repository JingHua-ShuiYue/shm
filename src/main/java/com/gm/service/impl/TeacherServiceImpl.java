package com.gm.service.impl;

import com.gm.dao.TeacherDao;
import com.gm.pojo.Teacher;
import com.gm.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;
    @Override
    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = teacherDao.selectAll();
        return teachers;
    }
}
