package com.emp.DTO;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.ToString;

public @ToString class EmpPayRollDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name is invalid")
	public String name;
	
	
	@Min(value=500,message = "minimum wage should be more then 500")
	public int salary;
	
	@Pattern(regexp="male|female",message="Gender need to be male or female")
	public String gender;
	
	@JsonFormat(pattern="dd MM yyyy")
	@NotNull(message="start date shouls not be null")
	@PastOrPresent(message="start date shouls be present date or past date")
	public LocalDate startDate;
	
	@NotBlank(message="Note cannot be blank")
	public String note;
	
	@NotBlank(message="profile pic cannot be blank")
	public String profilePic;
	
	@NotNull(message="department cannot be empty")
	public List<String> department;

	
	}
