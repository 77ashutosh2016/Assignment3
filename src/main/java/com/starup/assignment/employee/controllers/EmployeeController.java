package com.starup.assignment.employee.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public String employeeDetails()
    {

        return "RADHA ";
    }


}
