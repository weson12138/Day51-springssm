package com.controller;

import com.po.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/stu1")
public class StudentController1 {

    @RequestMapping("/getTh")
    public String getTh(ModelMap modelMap){
        modelMap.put("thTest","thText:设置标签的文本内容<a href=\"#\">百度</a>");
        modelMap.put("thUTest","thUText:设置标签的文本内容<a href=\"#\">百度</a>");
        modelMap.put("thValue","thValue:设置属性的值");
        modelMap.put("thObject",new Student(1,"张三"));
        modelMap.put("thIF","thIf is not null");
        modelMap.put("thEach",Arrays.asList("theach","循环列表"));
        return "getth";
    }

    @RequestMapping("/getFun")
    public String getFun(ModelMap modelMap){
        modelMap.put("testDate",new Date());
        modelMap.put("testNumber",88.888);
        modelMap.put("testBool",true);
        modelMap.put("testString","abcd1234");
        modelMap.put("testArray",new Integer[]{1,2,3,4,5,6});
        modelMap.put("testList",Arrays.asList(8,9,3,4,2,7,6));

        Map<String,String> map = new HashMap<>();
        map.put("name","张三");
        map.put("age","18");
        modelMap.put("testMap",map);
        return "getFun";
    }
}
