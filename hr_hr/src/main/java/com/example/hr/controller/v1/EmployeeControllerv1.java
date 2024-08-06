package com.example.hr.controller.v1;

import java.util.HashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
import com.example.hr.model.Dto.v1.EmployeeReqDtov1;
import com.example.hr.model.Entity.Employee;
import com.example.hr.model.mapper.Employeemapper;
import com.example.hr.servies.EmployeeServis;
import com.example.hr.servies.v1.EmployeeServisv1;
import com.example.hr.utilities.Employeeuntitiy;

import jakarta.validation.Valid;
import jakarta.validation.constraints.AssertFalse.List;
import jakarta.validation.constraints.NotNull;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController

@RequestMapping("/employees/v1")
//  Constructor  دي بدل Autowired  واسهل بتعمل 
@RequiredArgsConstructor    


public class EmployeeControllerv1 {
	

	private  final  EmployeeServisv1 employeeServisv1 ;

	

	
	@PostMapping(value = "/employee")
	public EmployeeResponDto saveEmployee(@RequestBody @Valid EmployeeReqDtov1 req) {
		return this.employeeServisv1.saveEmployee1(req);
	  
	}
	
	

	
	

}
