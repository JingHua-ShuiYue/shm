package com.gm.service.impl;

import com.gm.dao.SubjectDao;
import com.gm.pojo.Subject;
import com.gm.service.SubjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Resource
    private SubjectDao subjectDao;
    @Override
    public List<Subject> getAllSubject() {
        List<Subject> subjects = subjectDao.selectAll();
        return subjects;
    }
}
