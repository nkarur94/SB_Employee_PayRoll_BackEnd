package com.emp.DTO;

public class EmpDTO {
	
	private String name;
	private long salary;
	
	public EmpDTO(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpDTO [name=" + name + ", salary=" + salary + "]";
	}

	
	
}
