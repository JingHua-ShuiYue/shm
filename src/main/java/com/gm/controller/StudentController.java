package com.gm.controller;

import com.gm.R.R;
import com.gm.pojo.Student;
import com.gm.pojo.Subject;
import com.gm.pojo.Teacher;
import com.gm.pojo.User;
import com.gm.service.StudentService;
import com.gm.service.SubjectService;
import com.gm.service.TeacherService;
import com.gm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
     * 获取学生自己信息
     *
     * @param request
     * @return
     */
    @GetMapping("/student/getStudentSubject")
    public R<Student> studentGetSelfChooseSud(HttpServletRequest request) {
        Student selfInfo = studentService.getSelfInfo(request);
        return R.success(selfInfo);
    }

    /**
     * 获取全部的课程信息
     *
     * @return
     */
    @GetMapping("/student/getAllSubjectList")
    public R studentGetSubjectList() {
        List<Subject> allSubject = subjectService.getAllSubject();
        return R.success(allSubject);
    }

    /**
     * 获取老师信息列表 只获取名字和负责学科
     *
     * @return
     */
    @GetMapping("/student/getTeacherList")
    public R studentGetTeacherList() {
        List<Teacher> allTeachers = teacherService.getAllTeachers();
        return R.success(allTeachers);
    }

    /**
     * 选择科目
     *
     * @return
     */
    @GetMapping("/student/setChooseSubject")
    public R studentSetChooseSubject(HttpServletRequest request, String subject) {
        Student selfInfo = studentService.getSelfInfo(request);
        if (null == selfInfo.getStudent_sub()) {
            R r = studentService.chooseSubject(subject, 1001);
            return r;
        } else {
            return R.error("您已选" + selfInfo.getStudent_sub());
        }
    }

    /**
     * 退选已选科目
     *
     * @return
     */
    @GetMapping("/student/delChooseSubject")
    public R studentDelChooseSubject(HttpServletRequest request) {
        Student selfInfo = studentService.getSelfInfo(request);
        if (null == selfInfo.getStudent_sub()) {
            return R.error("还未选课，何来退课");
        } else {
            System.out.println(selfInfo.getStudent_sub() + "   " + selfInfo.getUid());
            R r = studentService.sendBackSubject(selfInfo.getStudent_sub(), selfInfo.getUid());
            return r;
        }
    }

}
