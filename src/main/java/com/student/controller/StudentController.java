package com.student.controller;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    //getAllStudents
    @QueryMapping
    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }

    @QueryMapping
    public Student getStudentById(@Argument int id)
    {
        return studentRepository.findById(id).orElseThrow(()-> new RuntimeException("Student not found with id : "+id));
    }
}
