package com.emp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.DTO.EmpPayRollDTO;
import com.emp.entity.EmpEntity;

@Service
public class EmpService implements IEmpService {
	List<EmpEntity> empDataInService = new ArrayList();

	public List<EmpEntity> getEmpDetails() {
		if (empDataInService.isEmpty()) {
			return null;
		} else
			return empDataInService;
	}

	public EmpEntity getEmpDetailsById(int id) {
		EmpEntity empData = null;

		if (empDataInService.size()<=id-1) {
			return null;
		} 
		else
			empData = empDataInService.get(id-1);
			return empData;

	}

	public List<EmpEntity> createEmpDetails(EmpPayRollDTO empDataDto) {
		EmpEntity empData = null;
		empData = new EmpEntity(empDataInService.size()+1, empDataDto);
		empDataInService.add(empData);
		return empDataInService;
	}

	public EmpEntity updateEmpDetails(int id, EmpPayRollDTO empDataDto) {
		EmpEntity empData = this.getEmpDetailsById(id);
		empData.setName(empDataDto.name);
		empData.setSalary(empDataDto.salary);
		empDataInService.set(id-1, empData);
		return empData;
	}

	public void deleteEmpDetailsById(int id) {
		empDataInService.remove(id-1);
	}

}
