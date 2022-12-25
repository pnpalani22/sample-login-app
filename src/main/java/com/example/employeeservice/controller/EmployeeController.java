package com.example.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

@Autowired
private EmployeeService EmployeeService;



@PostMapping
public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
	return new ResponseEntity<Employee>(EmployeeService.saveEmployee(employee),HttpStatus.CREATED);
}

@GetMapping
public ResponseEntity<List<Employee>> getAllEmployee(){
	return new ResponseEntity<List<Employee>>(EmployeeService.getAllEmployee(),HttpStatus.CREATED);
}
}
