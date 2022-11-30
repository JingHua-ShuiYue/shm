package com.gm.service;

import com.gm.R.R;
import com.gm.pojo.Student;
import com.gm.pojo.Subject;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface StudentService {
    /**
     * 获取当前登录账户的学生信息
     * @param request
     * @return
     */
    Student getSelfInfo(HttpServletRequest request);

    R chooseSubject(String subject, int uid);

    R sendBackSubject(String subject, int uid);
}
