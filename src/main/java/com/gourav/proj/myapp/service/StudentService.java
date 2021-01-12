package com.gourav.proj.myapp.service;

import java.util.ArrayList;
import java.util.List;

import com.gourav.proj.myapp.dao.Student;
import com.gourav.proj.myapp.repositories.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAllStudents(){
        Iterable<Student> I = studentRepo.findAll();
        List<Student> l = new ArrayList<>();
        I.forEach(e->l.add(e));
        return l;
    }
}
