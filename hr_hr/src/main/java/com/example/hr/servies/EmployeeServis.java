package com.example.hr.servies;

import org.springframework.stereotype.Service;

import com.example.hr.model.Dto.EmployeeDto;
import com.example.hr.model.Dto.EmployeeReqDto;
import com.example.hr.model.Dto.EmployeeResponDto;
import com.example.hr.model.Dto.EmployeeupdateDto;
@Service
public interface EmployeeServis {

	EmployeeResponDto saveEmployee(EmployeeReqDto req);
	
	String getdetilesEmployeebyid(long id);

	EmployeeResponDto updateEmployee(EmployeeupdateDto req) throws Exception;
	
	void deleteemployeebyid (long id);
	
	
	EmployeeDto get (long id);

	EmployeeResponDto saveEmployee11(EmployeeReqDto req);



	

}
