package com.employeehub.employeehub.service;

import com.employeehub.employeehub.model.Employee;
import com.employeehub.employeehub.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EmplyoyeeImp implements EmployeeService{
        List<Employee> employeeList = new ArrayList<>();

    @Autowired
    private final EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployee() {

        List<Employee> allEmployees = employeeRepository.findAll();
        if(!allEmployees.isEmpty()) {
            return allEmployees;
        }
        return null;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
       Employee empEntity = Employee.builder()
                .fName(employee.getFName())
                .lName(employee.getLName())
                .number(employee.getNumber())
                .email(employee.getEmail()).build();

       employeeRepository.save(empEntity);
        return employee;
    }
}
