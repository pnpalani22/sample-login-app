package com.example.employeeservice.aop;

import org.aspectj.lang.annotation.Pointcut;

abstract public class GlobalPointcuts {
	
	@Pointcut("execution(* com.example.employeeservice.*.*(..))")
	public void commonPointcut() {
	}
	
	
	@Pointcut("within(com.example.employeeservice..*)" +
	        " || within(com.example.employeeservice.service..*)" +
	        " || within(com.example.employeeservice.controller..*)" +
	        " || within(com.example.employeeservice.repository..*)")
	public void applicationPackagePointcut() {
		
	}
	
	 @Pointcut("within(@org.springframework.stereotype.Repository *)" +
		        " || within(@org.springframework.stereotype.Service *)" +
		        " || within(@org.springframework.web.bind.annotation.RestController *)")
		    public void springBeanPointcut() {
		        
		    }
	 
	 
}
