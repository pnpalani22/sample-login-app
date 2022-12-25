package com.example.employeeservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;




@Entity
@Table(name="employees")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Employee {
@Id
@GeneratedValue
 private long id;
@Column(name="employee_name")
 private String empName;
@Column(name="address")
 private String address;
@Column(name="active")
 private boolean active;
@Column(name="password")
 private String password;
@Column(name="gender")
 private String gender;
@Column(name="date_of_birth")
 private String dob;
@ManyToOne(cascade = {CascadeType.ALL})
 @JoinColumn(name = "department_id")
 private Department department;

 
}
