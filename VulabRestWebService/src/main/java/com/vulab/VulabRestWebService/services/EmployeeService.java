package com.vulab.VulabRestWebService.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vulab.VulabRestWebService.domain.Employee;
import com.vulab.VulabRestWebService.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public void deleteEmployee(int id) {
		employeeRepository.delete(id);
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Employee getEmployeeById(int id) {
		try {
			Employee e=  employeeRepository.getOne(id);
			return e;
		} catch (Exception e) {
			return null;
		}
		
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
