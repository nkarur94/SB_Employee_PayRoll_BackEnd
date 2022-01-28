package com.emp.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.DTO.EmpDTO;



@RestController
public class EmpController {

	@GetMapping("/payRoll")
	public ResponseEntity<String> payRollemployee(){
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> createEmp(@RequestBody EmpDTO empData){
		return new ResponseEntity<String>(" created successfully "+empData, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateEmp(@RequestBody EmpDTO empData){
		return new ResponseEntity<String>("updated successfully "+empData,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable int id){
		return new ResponseEntity<String>("deleted succesfully", HttpStatus.OK);
	}
	
}
