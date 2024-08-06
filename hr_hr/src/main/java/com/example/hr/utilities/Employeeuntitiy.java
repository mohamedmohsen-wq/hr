package com.example.hr.utilities;

import org.springframework.stereotype.Component;

import com.example.hr.servies.EmployeeServis;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Employeeuntitiy {
	private final EmployeeServis es;
	
	public String getdetilesEmployeebyid(long id) {
		return this.es.getdetilesEmployeebyid(id);
		
	}

	
}
