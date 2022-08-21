package com.example.studentsystem.service;

import com.example.studentsystem.model.Student;

import java.util.List;

public interface studentservice {
    public Student savestudent(Student student);
    public List<Student> getAllStudents();


}
