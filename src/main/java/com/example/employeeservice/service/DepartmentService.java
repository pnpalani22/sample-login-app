package com.example.employeeservice.service;

import java.util.List;

import com.example.employeeservice.model.Department;

public interface DepartmentService {
	Department getDepartment(String name);
	Department save(String departmentName);
	List<Department> getAllDepartment();
}
