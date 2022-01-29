package com.emp.service;

import java.util.List;

import com.emp.DTO.EmpPayRollDTO;
import com.emp.entity.EmpEntity;

public interface IEmpService {
	List<EmpEntity> getEmpDetails();
	EmpEntity getEmpDetailsById(int id);
	List<EmpEntity> createEmpDetails(EmpPayRollDTO empdataDTo);
	EmpEntity updateEmpDetails(int id,EmpPayRollDTO empdataDTo);
	void  deleteEmpDetailsById(int id);

}
