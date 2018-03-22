package com.vulab.VulabRestWebService.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "first_name", nullable=false)
	private String firstName;

	@Column(name = "last_name", nullable=false)
	private String lastName;

	@Column(name = "salary")
	private double salary;

	@Column(name = "dob", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dob;

	public Employee() {

	}

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public Employee(String firstName) {
		super();
		this.firstName = firstName;

	}

	public Employee(Date dob) {
		super();
		this.dob = dob;

	}

	public Employee(double salary) {
		super();
		this.salary = salary;

	}

	public Employee(String firstName, String lastName, double salary, Date dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
