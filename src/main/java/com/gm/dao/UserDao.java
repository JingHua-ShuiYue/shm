package com.gm.dao;

import com.gm.pojo.Student;
import com.gm.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    //登录
    User selectUser(User user);

    //注册学生账户
    int insert(User user);

    /**
     * 删除用户
     * @param id 要删除用户的id
     * @param role 从Session域中获取当前登录的账户，如果是admin允许执行，其他不允许
     * @return
     */
    int delUser(int id, String role);

    int update(User user);

    List<User> selectAllByRole(String role);

    User selectUserByUsername(String username);

    User selectUserByUid(int uid);
}
