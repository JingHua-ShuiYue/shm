package com.gm.service.impl;

import com.gm.dao.UserDao;
import com.gm.pojo.User;
import com.gm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User LoginVar(User user) {
        User userInfo = userDao.selectUser(user);
        return userInfo;
    }

    @Override
    public int addStudent(User user) {
        int i = userDao.insert(user);
        return i;
    }

    @Override
    public int addTeacher(User user, String role) {
        int i = userDao.insert(user);
        return i;
    }

    @Override
    public int removeUser(int id, String role) {
        int i = userDao.delUser(id, role);
        return i;
    }

    /**
     * 根据role查询user
     * @param role 角色
     * @return
     */
    @Override
    public List<User> getUsersByRole(String role) {
        List<User> users = userDao.selectAllByRole(role);
        return users;
    }

    @Override
    public User getUserByUsername(String username){
        User user = userDao.selectUserByUsername(username);
        return user;
    }
}
