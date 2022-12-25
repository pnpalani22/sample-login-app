package com.example.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeservice.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	Department findByName(String name);

	Department save(String departmentName);
	

}
