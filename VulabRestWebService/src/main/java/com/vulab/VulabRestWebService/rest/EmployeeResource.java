package com.vulab.VulabRestWebService.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vulab.VulabRestWebService.domain.Employee;
import com.vulab.VulabRestWebService.services.EmployeeService;

@RestController
public class EmployeeResource {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> retrieveAllEmplployees() {
		return employeeService.getAllEmployees();
	}

}
