package com.gm.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 用户表
 */
@Data
public class User {
    private int id; // 序号
    private int uid; //学号 / 职工号
    private String username; // 账户
    private String password; // 密码
    private String role; // 角色
}
