package com.nest.studentapp_backend.controller;

import com.nest.studentapp_backend.dao.StudentDao;
import com.nest.studentapp_backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDao dao;
    @GetMapping("/")
    public String Homepage(){
        return "welcome to my website";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/add",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> AddStudent(@RequestBody Students s){

        System.out.println(s.getName().toString());
        dao.save(s);
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");

        return  map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(value = "/search",consumes = "application/json",produces = "application/json")
    public List<Students> SearchStudent(@RequestBody Students s){

        System.out.println(s.getName());

        return (List<Students>) dao.searchStudent(s.getName());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> deleteStudent(@RequestBody Students s){

        String id = String.valueOf((s.getId()));
        dao.deleteStudent(s.getId());
        HashMap<String,String>map= new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path = "/view")
    public List<Students> view(){
        return (List<Students>) dao.findAll();
    }


}