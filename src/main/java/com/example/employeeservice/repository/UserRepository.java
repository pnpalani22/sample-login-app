package com.example.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeeservice.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);
	
	User save(User user);

}
