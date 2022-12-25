package com.example.employeeservice.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeservice.model.Department;
import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repository.DepartmentRepository;
import com.example.employeeservice.repository.EmployeeRepository;
import com.example.employeeservice.service.DepartmentService;
import com.example.employeeservice.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository employeeRepository;
	private DepartmentRepository departmentRepository;
	@Autowired
	private DepartmentService departmentService;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository,DepartmentRepository departmentRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.departmentRepository=departmentRepository;
	}


	@Override
	@Transactional
	public Employee saveEmployee(Employee employee) {
		Department department=departmentRepository.findByName(employee.getDepartment().getName());
		if(department==null) {
			department=departmentService.save(employee.getDepartment().getName());
		}
		employee.setDepartment(department);
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
