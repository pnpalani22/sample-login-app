package com.example.employeeservice.service;

import java.util.List;

import com.example.employeeservice.model.Employee;

public interface EmployeeService {
	
Employee saveEmployee(Employee employee);

List<Employee> getAllEmployee();
}
