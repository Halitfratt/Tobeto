package com.tobeto.bootcampproject.dataaccess.abstracts;

import com.tobeto.bootcampproject.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
