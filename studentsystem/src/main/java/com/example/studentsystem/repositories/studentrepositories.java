package com.example.studentsystem.repositories;

import com.example.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentrepositories extends JpaRepository<Student,Integer> {

}
