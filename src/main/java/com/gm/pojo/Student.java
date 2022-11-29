package com.gm.pojo;

import lombok.Data;

/**
 * 学生信息
 */
@Data
public class Student {
    private int id; // 学生id  主键
    private String student_name; // 学生姓名
    private String sub; // 选的课题
}
