package com.gm.pojo;

import lombok.Data;

/**
 * 选课表
 */
@Data
public class Subject {
    private int subject_id; // 课程id
    private String subject; // 课程名称
    private String address; // 上课地点
    private String teacher; // 授课老师
    private String time; // 实验时间
    private int num; // 剩余可选数量
    private int class_hour;
}
