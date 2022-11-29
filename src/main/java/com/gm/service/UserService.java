package com.gm.service;

import com.gm.pojo.User;
import java.util.List;

public interface UserService {
    User LoginVar(User user);    //登录

    int addStudent(User user);  //添加学生

    int addTeacher(User user, String role);     //添加老师

    int removeUser(int id, String role);    //删除用户

    List<User> getUsersByRole(String role);  //通过角色获取用户

    User getUserByUsername(String username);
}
