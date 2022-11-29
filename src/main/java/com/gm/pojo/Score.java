package com.gm.pojo;

import lombok.Data;

/**
 * 成绩
 */
@Data
public class Score {
    private int id;
    private int attendance; // 考勤成绩
    private int exam;   // 实验成绩
}
