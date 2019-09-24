package com.dao;

import com.po.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentDao {

    public Student findById(int stuNo);

    public List<Student> findAll();

    public List<Student> findByCondtiton1(Student stu);
}
