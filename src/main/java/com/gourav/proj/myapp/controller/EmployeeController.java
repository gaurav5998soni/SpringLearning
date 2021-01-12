package com.gourav.proj.myapp.controller;

import java.util.List;

import com.gourav.proj.myapp.dao.Employee;
import com.gourav.proj.myapp.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> Employee(){
        return employeeService.getAllEmployees(); 
    }
    @PostMapping("/")
    public void addEmployee(@RequestBody Employee emp){
        employeeService.addEmployee(emp);
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable int id){
        employeeService.deleteEmployeeById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateEmployeeById(@PathVariable int id, @RequestBody Employee emp){
        employeeService.updateEmployeeById(id, emp);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
