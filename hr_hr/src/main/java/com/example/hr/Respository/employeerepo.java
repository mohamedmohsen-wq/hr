package com.example.hr.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hr.model.Entity.Employee;

public interface employeerepo  extends JpaRepository<Employee, Long>{

}
