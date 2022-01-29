package com.emp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.emp.DTO.EmpPayRollDTO;
import com.emp.entity.EmpEntity;

@Service
public class EmpService implements IEmpService {
	List<EmpEntity> empDataInService = new ArrayList();
	private static final AtomicInteger autoId= new AtomicInteger();

	@Override
	public List<EmpEntity> getEmpDetails() {
		if (empDataInService.isEmpty()) {
			return null;
		} else
			return empDataInService;
	}
	
	@Override
	public EmpEntity getEmpDetailsById(int id) {
		EmpEntity empData = null;

		if (empDataInService.size()<=id-1) {
			return null;
		} 
		else
			empData = empDataInService.get(id-1);
			return empData;

	}
	
	@Override
	public EmpEntity createEmpDetails(EmpPayRollDTO empDataDto) {
		EmpEntity empData = null;
		empData = new EmpEntity(autoId.incrementAndGet(), empDataDto);
		empDataInService.add(empData);
		return empData;
	}
	
	@Override
	public EmpEntity updateEmpDetails(int id, EmpPayRollDTO empDataDto) {
		EmpEntity empData = this.getEmpDetailsById(id);
		empData.setName(empDataDto.name);
		empData.setSalary(empDataDto.salary);
		empDataInService.set(id-1, empData);
		return empData;
	}
	
	@Override
	public void deleteEmpDetailsById(int id) {
		empDataInService.remove(id-1);
	}

}
