package com.example.studentsystem.service;

import com.example.studentsystem.model.Student;
import com.example.studentsystem.repositories.studentrepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentserviceimple implements studentservice{

    @Autowired
    private studentrepositories studentRepository;
    @Override
    public Student savestudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
