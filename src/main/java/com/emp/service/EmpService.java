package com.emp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.DTO.EmpPayRollDTO;
import com.emp.entity.EmpEntity;

@Service
public class EmpService implements IEmpService {
	public List<EmpEntity> getEmpDetails() {
		List<EmpEntity> empDataInService = new ArrayList();
		empDataInService.add(new EmpEntity(1, new EmpPayRollDTO("naveen", 433333)));
		return empDataInService;
	}

	public EmpEntity getEmpDetailsById(int id) {
		EmpEntity empData = null;
		empData = new EmpEntity(id, new EmpPayRollDTO("nithun", 22222));
		return empData;

	}

	public EmpEntity createEmpDetails(EmpPayRollDTO empDataDto) {
		EmpEntity empData = null;
		empData = new EmpEntity(1, empDataDto);
		return empData;
	}

	public EmpEntity updateEmpDetails(EmpPayRollDTO empDataDto) {
		EmpEntity empData = null;
		empData = new EmpEntity(1, empDataDto);
		return empData;

	}

	public EmpEntity deleteEmpDetailsById(int id) {
		List<EmpEntity> empDataToDelete = new ArrayList();
		empDataToDelete.remove(id);
		EmpEntity empData = (EmpEntity) empDataToDelete;
		return empData;

	}

}
