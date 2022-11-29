package com.gm.controller;

import com.gm.R.R;
import com.gm.pojo.User;
import com.gm.service.StudentService;
import com.gm.service.SubjectService;
import com.gm.service.TeacherService;
import com.gm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class StudentController {

    @Resource
    private UserService userService;
    @Resource
    private TeacherService teacherService;
    @Resource
    private StudentService studentService;
    @Resource
    private SubjectService subjectService;

    /**
     * 获取学生自己选课的信息
     * @param request
     * @return
     */
    @GetMapping("/student/getStudentSubject")
    public R<User> studentGetSelfChooseSud(HttpServletRequest request){

        return null;
    }

    /**
     * 获取全部的课程信息
     * @return
     */
    @GetMapping("/student/getAllSubjectList")
    public R studentGetSubjectList(){
        return null;
    }

    /**
     * 获取自己的成绩信息
     * @return
     */
    @GetMapping("/student/getStudentScore")
    public R studentGetStudentScore(){
        return null;
    }

    /**
     * 获取老师信息列表 只获取名字和负责学科
     * @return
     */
    @GetMapping("/student/getTeacherList")
    public R studentGetTeacherList(){
        return null;
    }

    /**
     * 选择科目
     * @return
     */
    @GetMapping("/student/setChooseSubject")
    public R studentSetChooseSubject(){
        return null;
    }

    /**
     * 退选已选科目
     * @return
     */
    @GetMapping("/student/delChooseSubject")
    public R studentDelChooseSubject(){
        return null;
    }

}
