package com.example.hr.model.Dto.v1;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class EmployeeReqDtov1 {
	
//	@Pattern(regexp = "^[A-Z]+$",message = "not val")
	@NotNull(message = "please not null name")
	private String name;

	private String fullname;
	
//	@Min(value = 7)
//	@Max(value = 20)
	@NotNull(message = "please not null password")
	private String password;
	@NotNull(message = "please not null email")
	@Email
	private String email;
	

}
