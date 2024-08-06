package com.example.hr.servies.impl.v1;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceimpv1 implements EmployeeServisv1 {
	
	private final employeerepo repo ;
	
	private final Employeemapper mapper;
	
		
	
	@Override
	public EmployeeResponDto saveEmployee1(EmployeeReqDtov1 req) {
		Employee emplye= this.mapper.toEntity(req);
		Employee saveEmplo=this.repo.save(emplye);
		return this.mapper.toResponDto(saveEmplo);
	
	  
	}



	
}
