package com.gourav.proj.myapp.repositories;
import com.gourav.proj.myapp.dao.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
    
}
