package com.nest.studentapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String Homepage(){
        return "welcome to my website";
    }


    @PostMapping("/add")
    public  String AddStudent(){
        return  "welcome to add student  Page";
    }


}