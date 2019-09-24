package com.controller;


import com.po.Student;
import com.service.Impl.StudentServiceImpl;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/{stuNo}")
    public Student findById(@PathVariable("stuNo") Integer stuNo){
        Student stu = studentService.findById(stuNo);
        return stu;
    }


    @RequestMapping("/findById2")
    public Student finById2(Integer stuNo){
        Student stu2 = studentService.findById(stuNo);
        return stu2;
    }


//    @GetMapping("/findAll")
    @RequestMapping("/findAll")
    public List<Student> findAll(){
        List<Student> list = studentService.findAll();
        return list;
    }


}
