package com.example.hr.model.Dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data 
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
	private long id;
	private String name;
	private String fullname;
	private String password;
	private String email;
	private LocalDateTime creatAt;
	private LocalDateTime updateAt;
	private LocalDateTime deleteAt;
	

}
