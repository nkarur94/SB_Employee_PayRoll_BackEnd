package com.emp.entity;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import com.emp.DTO.EmpPayRollDTO;

import lombok.Data;


public @Data class EmpEntity {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int salary;

	public EmpEntity(int id, EmpPayRollDTO empData) {
		super();
		this.id = id;
		this.name = empData.name;
		this.salary = empData.salary;
	}

//	public EmpEntity(EmpPayRollDTO empData) {
//		super();
//		this.name = empData.name;
//		this.salary = empData.salary;
//	}

	

}
