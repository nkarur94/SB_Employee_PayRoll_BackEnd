package com.emp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.DTO.EmpPayRollDTO;
import com.emp.entity.EmpEntity;
import com.emp.exception.EmpCustomExceptionForId;
import com.emp.repository.EmpRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmpService implements IEmpService {
	
	@Autowired
	private EmpRepo empRepoInService;
	

	@Override
	public List<EmpEntity> getEmpDetails() {
		return empRepoInService.findAll();
	}
	
	@Override
	public EmpEntity getEmpDetailsById(int id) {
		return empRepoInService.
				findById(id).
				orElseThrow( () -> new EmpCustomExceptionForId("employee with empid "+ id +" does not exist!!"));
	}
	
	@Override
	public List<EmpEntity> getEmpDetailsByDepartment(String department) {
		return empRepoInService.findEmployeeByDept(department);
	}

	@Override
	public EmpEntity createEmpDetails(EmpPayRollDTO empDataDto) {
		EmpEntity empData = null;
		empData = new EmpEntity(empDataDto);
		log.debug("Emp data:"+empData.toString());
		return empRepoInService.save(empData);
	}
	
	@Override
	public EmpEntity updateEmpDetails(int id, EmpPayRollDTO empDataDto) {
		EmpEntity empData = this.getEmpDetailsById(id);
		empData.updatedEmpPayRollDTO(empDataDto);
		return empRepoInService.save(empData);
	}
	
	@Override
	public void deleteEmpDetailsById(int id) {
		EmpEntity empData = this.getEmpDetailsById(id);
		empRepoInService.delete(empData);
	}

}
