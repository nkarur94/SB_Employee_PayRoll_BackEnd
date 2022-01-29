package com.emp.DTO;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class EmpPayRollDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name is invalid")
	public String name;
	
	
	@Min(value=500,message = "minimum wage should be more then 500")
	public int salary;

	public EmpPayRollDTO(String name,int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}
