package com.example.employeeservice.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="departments")
public class Department {
	@Id
	@Column(name="department_id")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column(name="department_name")
	private String name;
	

}
