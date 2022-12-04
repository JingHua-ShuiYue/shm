package com.gm.service.impl;

import com.gm.R.R;
import com.gm.dao.StudentDao;
import com.gm.dao.SubjectDao;
import com.gm.dao.UserDao;
import com.gm.pojo.Student;
import com.gm.pojo.Subject;
import com.gm.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Resource
    private UserDao userDao;
    @Resource
    private SubjectDao subjectDao;

    @Override
    public Student getSelfInfo(HttpServletRequest request) {
        String username = (String) request.getSession().getAttribute("username");
        int uid = userDao.selectUserByUsername(username).getUid();
        Student student = studentDao.selectByUid(uid);
        return student;
    }

    @Override
    public R chooseSubject(String subject, int uid) {
        Subject subject1 = subjectDao.selectBySubject(subject);
        int num = subject1.getNum();
        if (num <= 0) {
            return R.error("课程已被选光");
        }
        --num;
        subject1.setNum(num);
        int i = subjectDao.updateSubject(subject1);
        int i1 = studentDao.updateSubject(subject, uid);
        if (i == 0 || i1 == 0) {
            return R.error("请重试");
        } else {
            return R.success("抢课成功");
        }
    }

    /**
     * 退课
     *
     * @param subject
     * @param uid
     * @return
     */
    @Override
    public R sendBackSubject(String subject, int uid) {
        Subject subject1 = subjectDao.selectBySubject(subject);
        subject1.setNum((subject1.getNum() + 1));
        int i1 = subjectDao.updateSubject(subject1);
        int i = studentDao.updateSubject("NULL", uid);
        if (i1 == 0 || i == 0) {
            return R.error("请重试");
        }
        return R.success("退课成功");
    }


}
