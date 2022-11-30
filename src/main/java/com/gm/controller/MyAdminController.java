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
public class MyAdminController {
    @Resource
    private UserService userService;
    @Resource
    private TeacherService teacherService;
    @Resource
    private StudentService studentService;
    @Resource
    private SubjectService subjectService;
/*
    *//**
     * 获取全部的User
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminGetAllUser(){
        return null;
    }

    *//**
     * 获取全部的学生信息
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminGetAllStudent(){
        return null;
    }

    *//**
     * 获取全部的教师信息
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminGetAllTeacher(){
        return null;
    }

    *//**
     * 获取全部的学科信息
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminGetAllSubject(){
        return null;
    }

    *//**
     * 更改学生信息
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminAlterStudentInfo(){
        return null;
    }

    *//**
     * 更改教师信息
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminAlterTeacherInfo(){
        return null;
    }

    *//**
     * 更改课程信息
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminAlterSubjectInfo(){
        return null;
    }

    *//**
     * 更改User密码
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminAlterUserPassword(){
        return null;
    }

    *//**
     * 添加user
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminAddUser(){
        return null;
    }

    *//**
     * 添加学生
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminAddStudent(){
        return null;
    }

    *//**
     * 添加教师信息
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminAddTeacher(){
        return null;
    }

    *//**
     * 添加课程信息
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminAddSubject(){
        return null;
    }

    *//**
     * 删除User
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminDelUser(){
        return null;
    }

    *//**
     * 删除学生
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminDelStudent(){
        return null;
    }

    *//**
     * 删除老师
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminDelTeacher(){
        return null;
    }

    *//**
     * 删除课程
     * @return
     *//*
    @GetMapping("/admin/")
    public R adminDelSubject(){
        return null;
    }*/
}
