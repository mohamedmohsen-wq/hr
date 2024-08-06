package com.example.hr.model.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
  
// انا بعمل respons ده عشان الامان مينفعش يرجعلي كل الداتا فا انا بحط فيه الداتا الي انا عايزها تظهر وبس 

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeupdateDto {
	private long id;
	private String fullname;
	private String password;
	private String email;
	

}
