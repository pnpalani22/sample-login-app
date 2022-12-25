package com.example.employeeservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employeeservice.model.Department;
import com.example.employeeservice.repository.DepartmentRepository;
import com.example.employeeservice.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
private DepartmentRepository departmentRepository;
	
	
	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

	@Override
	public Department getDepartment(String name) {
		return departmentRepository.findByName(name);
	}

	@Override
	public Department save(String departmentName) {
		// TODO Auto-generated method stub
		return departmentRepository.save(departmentName);
	}

}
