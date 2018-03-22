package com.vulab.VulabRestWebService;

import java.util.Date;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.vulab.VulabRestWebService.domain.Employee;
import com.vulab.VulabRestWebService.services.EmployeeService;


@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class VulabRestWebServiceApplicationTests {
	
	@Autowired
	EmployeeService employeeService;

	@Test
	public void contextLoads() {
	}
	
	
	@Test
	@Rollback(false)
	public void testSaveEmployee() {
		
		Employee aaryav = new Employee("Sar","Veer",100,new Date());
		Employee siri = new Employee("Malli","Siri");
		
		Employee e = new Employee();
		//e.firstName = "saritha";
		e.setFirstName("Saritha");
		e.setLastName("Veeramachineni");
		e.setSalary(100);
		e.setDob(new Date());
		
		employeeService.saveEmployee(aaryav);
		
		Employee aaryavFromDB = employeeService.getEmployeeById(aaryav.getId());
		
		Assert.assertTrue(aaryavFromDB.getId() > 0);
		
	}
	
	@Test
	@Rollback(false)
	public void testSaveEmployee2() {
		
		Employee aaryav = new Employee("Sar","Veer",100,new Date());
		Employee siri = new Employee("Malli","Siri");
		
		
		Employee e = new Employee();
		//e.firstName = "saritha";
		e.setFirstName("Saritha");
		e.setLastName("Veeramachineni");
		e.setSalary(100);
		e.setDob(new Date());
		
		employeeService.saveEmployee(aaryav);
		
		Employee aaryavFromDB = employeeService.getEmployeeById(aaryav.getId());
		
		Assert.assertTrue(aaryavFromDB.getId() > 0);
		
		
	}
	
	@Test
	@Rollback(false)
	public void testreadEmployee() {
		
		Employee aaryav = new Employee("Sar","Veer",100,new Date());
		Employee siri = new Employee("Malli","Siri");
		
		
		Employee e = new Employee();
		//e.firstName = "saritha";
		e.setFirstName("Saritha");
		e.setLastName("Veeramachineni");
		e.setSalary(100);
		e.setDob(new Date());
		
		employeeService.saveEmployee(aaryav);
		
		Employee aaryavFromDB = employeeService.getEmployeeById(aaryav.getId());
		
		Assert.assertTrue(aaryavFromDB.getId() > 0);
		
		}
	
	
	@Test
	@Rollback(false)
	public void testDeleteEmployee() {
				
		Employee e = employeeService.getEmployeeById(1);
		Assert.assertNull(e);
				
				}


}
