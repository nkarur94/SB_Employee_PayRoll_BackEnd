package com.emp.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.emp.DTO.EmpPayRollDTO;

public class EmpEntity {
	
	private int id;
	private String name;
	private int salary;

	public EmpEntity(int id, EmpPayRollDTO empData) {
		super();
		this.id = id;
		this.name = empData.name;
		this.salary = empData.salary;
	}

	public EmpEntity(EmpPayRollDTO empData) {
		super();
		this.id = id;
		this.name = empData.name;
		this.salary = empData.salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
