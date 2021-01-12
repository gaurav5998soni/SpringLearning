package com.gourav.proj.myapp.controller;

import java.util.List;

import com.gourav.proj.myapp.dao.Student;
import com.gourav.proj.myapp.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students/")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
