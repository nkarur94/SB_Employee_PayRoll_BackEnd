package com.emp.controller;


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





@RestController
public class EmpController {

	@GetMapping("/payRoll")
	public ResponseEntity<ResponseDTO> payRollemployee(){
		ResponseDTO response=new ResponseDTO("hello", null);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createEmp(@RequestBody EmpPayRollDTO empdataDTo){
		EmpEntity empData=null;
		empData= new EmpEntity(1,empdataDTo);
		ResponseDTO response=new ResponseDTO("created the data successfully", empData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> viewEmp(@PathVariable int id){
		EmpEntity empData=null;
		empData=new EmpEntity(id, new EmpPayRollDTO("nithun", 2222));
		ResponseDTO response=new ResponseDTO("view", empData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmp(@RequestBody EmpPayRollDTO empdataDTo){
		EmpEntity empData=null;
		empData= new EmpEntity(1,empdataDTo);
		ResponseDTO response=new ResponseDTO("updated the data successfully", empData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteEmp(@PathVariable int id, EmpPayRollDTO empData){
		ResponseDTO response=new ResponseDTO("deleted the data successfully",empData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);	}
	
}
