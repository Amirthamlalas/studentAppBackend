package com.nest.studentapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String Homepage(){
        return "welcome to my website";
    }


    @GetMapping("/contact")
    public  String ContactPage(){
        return  "welcome to Contact Page";
    }

    @GetMapping("/galary")
    public  String GalaryPage(){
        return  "welcome to galary";
    }
}