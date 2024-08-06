package com.example.hr.model.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import com.example.hr.model.Dto.EmployeeDto;
import com.example.hr.model.Dto.EmployeeReqDto;
import com.example.hr.model.Dto.EmployeeResponDto;
import com.example.hr.model.Dto.EmployeeupdateDto;
import com.example.hr.model.Dto.v1.EmployeeReqDtov1;
import com.example.hr.model.Entity.Employee;
// import org.mapstruct.Mapper;  ركز لازم تحمل دي 
@Mapper(componentModel = "spring")
public interface Employeemapper {

	Employee toEntity(EmployeeReqDto req);

	EmployeeResponDto toResponDto(Employee saveEmplo);
	
	
	Employee toEntity(EmployeeupdateDto req);
	
	
	Employee toEntity(EmployeeDto req);
	
	EmployeeDto toDto(Employee entity);

	Employee toEntity(EmployeeReqDtov1 req);
	

	

}
