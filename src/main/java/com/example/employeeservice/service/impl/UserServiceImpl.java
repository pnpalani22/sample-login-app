package com.example.employeeservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employeeservice.model.User;
import com.example.employeeservice.repository.UserRepository;
import com.example.employeeservice.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	
private UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
