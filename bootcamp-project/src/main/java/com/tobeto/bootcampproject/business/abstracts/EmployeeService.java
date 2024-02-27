package com.tobeto.bootcampproject.business.abstracts;

import com.tobeto.bootcampproject.core.entities.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee();
    Employee getById();
    List<Employee> getAllEmployees();
    Employee updateEmployee();
    void deleteEmployee();
}
