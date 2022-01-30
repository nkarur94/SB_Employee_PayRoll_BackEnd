package com.emp.entity;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.emp.DTO.EmpPayRollDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emp_payroll")
public @Data class EmpEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="emp_salary")
	private int salary;
	
	@Column(name="emp_gender")
	private String gender;
	
	@Column(name="emp_start_date")
	private LocalDate startDate;
	
	@Column(name="emp_note")
	private String note;
	
	@Column(name="emp_profile_pic")
	private String profilePic;
	
	
	@ElementCollection
	@CollectionTable(name="emp_departments",joinColumns = @JoinColumn(name="emp_id"))
	@Column(name="department")
	private List<String> department;

	public EmpEntity( EmpPayRollDTO empData) {
		this.updatedEmpPayRollDTO(empData);
		
}

	public void updatedEmpPayRollDTO(EmpPayRollDTO empDTO) {
		this.name = empDTO.name;
		this.salary = empDTO.salary;
		this.gender= empDTO.gender;
		this.startDate=empDTO.startDate;
		this.note=empDTO.note;
		this.profilePic=empDTO.profilePic;
		this.department=empDTO.department;
	}

	

}
