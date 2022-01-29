package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.DTO.EmpPayRollDTO;
import com.emp.DTO.ResponseDTO;
import com.emp.entity.EmpEntity;
import com.emp.service.IEmpService;

@RestController
public class EmpController {

	@Autowired
	private IEmpService empServiceData;

	@GetMapping("/get")
	public ResponseEntity<ResponseDTO> payRollemployee() {
		List<EmpEntity> empData = null;
		empData = empServiceData.getEmpDetails();
		ResponseDTO response = new ResponseDTO("hello", empData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createEmp(@RequestBody EmpPayRollDTO empdataDTo) {
		List<EmpEntity> empData = null;
		empData = empServiceData.createEmpDetails(empdataDTo);
		ResponseDTO response = new ResponseDTO("created the data successfully", empData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> viewEmp(@PathVariable int id) {
		EmpEntity empData = null;
		empData = empServiceData.getEmpDetailsById(id);
		ResponseDTO response = new ResponseDTO("view", empData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateEmp(@PathVariable int id, @RequestBody EmpPayRollDTO empdataDTo) {
		EmpEntity empData = null;
		empData = empServiceData.updateEmpDetails(id, empdataDTo);
		ResponseDTO response = new ResponseDTO("updated the data successfully", empData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteEmp(@PathVariable int id) {
		
		empServiceData.deleteEmpDetailsById(id);
		ResponseDTO response = new ResponseDTO("deleted the data successfully","emp id:"+id);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

}
