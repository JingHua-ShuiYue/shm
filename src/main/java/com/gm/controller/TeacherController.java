package com.gm.controller;

import com.gm.R.R;
import com.gm.service.StudentService;
import com.gm.service.SubjectService;
import com.gm.service.TeacherService;
import com.gm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
@Slf4j
@Controller
public class TeacherController {

    @Resource
    private UserService userService;
    @Resource
    private TeacherService teacherService;
    @Resource
    private StudentService studentService;
    @Resource
    private SubjectService subjectService;

    /**
     * 获取自身信息
     *
     * @return
     */
    @GetMapping("/teacher/")
    public R teacherGetSelfInfo() {
        return null;
    }

    /**
     * 更改密码
     *
     * @return
     */
    @GetMapping("/teacher/")
    public R teacherAlterSelfPassword() {
        return null;
    }

    /**
     * 更改自身信息
     *
     * @return
     */
    @GetMapping("/teacher/")
    public R teacherAlterSelfInfo() {
        return null;
    }

    /**
     * 获取自己讲授课程的学生
     *
     * @return
     */
    @GetMapping("/teacher/")
    public R teacherGetUsers() {
        return null;
    }

    /**
     * 设置分数 打卡分数 实验分数
     *
     * @return
     */
    @GetMapping("/teacher/")
    public R teacherSetScore() {
        return null;
    }

    /**
     * 获取自己所讲授课程的信息
     *
     * @return
     */
    @GetMapping("/teacher/")
    public R teacherGetSubjectInfo() {
        return null;
    }

    /**
     * 通过分数区间查找学生
     *
     * @return
     */
    @GetMapping("/teacher/")
    public R teacherGetStudentByScore() {
        return null;
    }

    /**
     * 通过名字查找学生
     *
     * @return
     */
    @GetMapping("/teacher/")
    public R teacherGetStudentByStudentName() {
        return null;
    }

    /**
     * 通过学号查找学生
     *
     * @return
     */
    @GetMapping("/teacher/")
    public R teacherGetStudentByUid() {
        return null;
    }


}
