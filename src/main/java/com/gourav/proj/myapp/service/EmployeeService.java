package com.gourav.proj.myapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.gourav.proj.myapp.dao.Employee;
import com.gourav.proj.myapp.repositories.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees(){
        Iterable<Employee> emps= employeeRepo.findAll();
        List<Employee> ls = new ArrayList<>();
        emps.forEach(e->ls.add(e));
        return ls;
    }

    public void addEmployee(Employee e){
        employeeRepo.save(e);
    }
    public Employee getEmployeeById(int id){
        Optional<Employee> emp=  employeeRepo.findById(id);
        return emp.get();
    }
    public void deleteEmployeeById(int id){
        Optional<Employee> emp = employeeRepo.findById(id);
        employeeRepo.delete(emp.get());
    }
    public void updateEmployeeById(int id, Employee emp){
        Optional<Employee> emp2=  employeeRepo.findById(id);
        Employee e2 = emp2.get();
        e2.setAge(emp.getAge());
        e2.setName(emp.getName());
        employeeRepo.save(e2);
    }

}
