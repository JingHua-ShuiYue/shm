package com.gm.pojo;

import lombok.Data;

/**
 * 学生信息
 */
@Data
public class Student {
    private int id; // id  主键
    private int uid; // 学号
    private String student_name; // 学生姓名
    private String student_sub; // 选的课题
    private int student_attendance; // 考勤成绩
    private int student_exam;   // 实验成绩
}
