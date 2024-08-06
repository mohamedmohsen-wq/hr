package com.example.hr.controller;

import java.util.UUID;
import java.util.logging.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hr.Respository.employeerepo;
import com.example.hr.model.Dto.EmployeeDto;
import com.example.hr.model.Dto.EmployeeReqDto;
import com.example.hr.model.Dto.EmployeeResponDto;
import com.example.hr.model.Dto.EmployeeupdateDto;
import com.example.hr.model.Entity.Employee;
import com.example.hr.model.mapper.Employeemapper;
import com.example.hr.servies.EmployeeServis;
import com.example.hr.utilities.Employeeuntitiy;

import ch.qos.logback.classic.Logger;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController

@RequestMapping("/employees")
//  Constructor  دي بدل Autowired  واسهل بتعمل 
@RequiredArgsConstructor    
@Slf4j

public class EmployeeController {
	

	private  final  EmployeeServis es;
	private final Employeeuntitiy employeeuntitiy;
	
//	@GetMapping دي الطريقه الصح لكتابة 
	
	
	
//	@RequestParam vs @PathVariable الفرق بين هو 
//RequestParam  في السيرش علي حاجات كتير  وتانيه عكسها 	لو  
	
	
	@GetMapping("/employee/{id}")
public EmployeeDto getemployeeByPathVariable(@PathVariable(name = "id") long id) {
		

		return this.es.get(id);
	}
	
	@PostMapping(value = "/employee")
	public EmployeeResponDto saveEmployee(@RequestBody EmployeeReqDto req) {
//		String correlandId=UUID.randomUUID().toString();
//         req.setToken(UUID.randomUUID().toString());
		log.info("employee save  : {} deteles name : {}   " , req,req.getName());
		return ((EmployeeServis) this.es).saveEmployee(req);
	  
	}
	
	@PostMapping(value = "/employee",params = "v=1.1.0")
	public EmployeeResponDto saveEmployee11(@RequestBody EmployeeReqDto req) {
		return this.es.saveEmployee11(req);
	  
	}
	
	@GetMapping( value = "/employee")
	public String getdetilesEmployeebyid(@RequestParam(name = "id") long id) {
		log.info("employee with id  : {}" , id);
		return this.employeeuntitiy.getdetilesEmployeebyid(id);
	}
	@PutMapping( value = "/employee")
	public EmployeeResponDto updateEmployee(@RequestBody EmployeeupdateDto req) throws Exception {
		return this.es.updateEmployee(req);
	  
	}
	@DeleteMapping( value = "employee")
	public void deleteemployeebyid( @RequestParam(name = "id") long id) {
		this.es.deleteemployeebyid(id);
		
	}

	
	
	
	

}
