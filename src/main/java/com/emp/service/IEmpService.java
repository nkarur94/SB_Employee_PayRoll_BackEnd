package com.emp.service;

import java.util.List;

import com.emp.DTO.EmpPayRollDTO;
import com.emp.entity.EmpEntity;

public interface IEmpService {
	List<EmpEntity> getEmpDetails();
	EmpEntity getEmpDetailsById(int id);
	EmpEntity createEmpDetails(EmpPayRollDTO empdataDTo);
	EmpEntity updateEmpDetails(EmpPayRollDTO empdataDTo);
	EmpEntity deleteEmpDetailsById(int id);

}
