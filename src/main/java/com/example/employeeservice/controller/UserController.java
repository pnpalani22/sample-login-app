package com.example.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeservice.model.User;
import com.example.employeeservice.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	@GetMapping
	@RequestMapping("/{username}")
	public ResponseEntity<User> getAllEmployee(@PathVariable("username")String username){
		return new ResponseEntity<User>(userService.getUserByUsername(username),HttpStatus.CREATED);
	}
}
