package com.service.Impl;

import com.dao.StudentDao;
import com.po.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Override
    public Student findById(int stuNo) {
        return studentDao.findById(stuNo);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }


    @Override
    public List<Student> findByCondtiton1(Student stu) {
        return studentDao.findByCondtiton1(stu);
    }
}
