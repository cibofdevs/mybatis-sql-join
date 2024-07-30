package com.example.demo.controller;

import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeMapper.findAll();
    }

    @GetMapping("/left-join")
    public List<Map<String, Object>> getLeftJoin() {
        return employeeMapper.leftJoin();
    }

    @GetMapping("/right-join")
    public List<Map<String, Object>> getRightJoin() {
        return employeeMapper.rightJoin();
    }

    @GetMapping("/inner-join")
    public List<Map<String, Object>> getInnerJoin() {
        return employeeMapper.innerJoin();
    }

    @GetMapping("/full-join")
    public List<Map<String, Object>> getFullJoin() {
        return employeeMapper.fullJoin();
    }
}
