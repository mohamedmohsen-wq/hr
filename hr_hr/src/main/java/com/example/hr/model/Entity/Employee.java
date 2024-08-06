package com.example.hr.model.Entity;

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
@Entity
@Table(name = "employee")
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee-id")
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "fullname")
	private String fullname;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	
	private String token;

	@Column(name = "creat_At")
//	دي بتخلي يضيف الوقت اتوماتيك 
	@CreationTimestamp 
	
	private LocalDateTime creatAt;
	@Column(name = "update_At")
	@UpdateTimestamp
	private LocalDateTime updateAt;
	@Column(name = "delete_At")
	private LocalDateTime deleteAt;
	

}
