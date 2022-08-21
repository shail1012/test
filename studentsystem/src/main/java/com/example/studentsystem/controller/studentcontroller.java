package com.example.studentsystem.controller;

import com.example.studentsystem.model.Student;
import com.example.studentsystem.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class studentcontroller
{
    @Autowired
    private studentservice studentservice;
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentservice.savestudent(student);
        return "New student is added";
    }
    @GetMapping("/getAll")
    public List<Student> getsAllStudents(){
        return studentservice.getAllStudents();
    }
}
