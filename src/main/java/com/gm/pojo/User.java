package com.gm.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 用户表
 */
@Data
public class User {
    private int id; // 唯一id
    private String username; // 账户
    private String password; // 密码
    private String role; // 角色
}
