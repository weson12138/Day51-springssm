package com.service;

import com.po.Student;

import java.util.List;

public interface StudentService {
    public Student findById(int stuNo);
    public List<Student> findAll();
    public List<Student> findByCondtiton1(Student stu);
}
