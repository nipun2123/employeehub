package com.employeehub.employeehub.service;

import com.employeehub.employeehub.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    List<Employee> getAllEmployee();

    Employee saveEmployee(Employee employee);
}
