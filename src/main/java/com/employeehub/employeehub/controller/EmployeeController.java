package com.employeehub.employeehub.controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String viewAll(){
        return "All emplyees";
    }


    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public String addEmp(){
        return "added emplyees";
    }
}
