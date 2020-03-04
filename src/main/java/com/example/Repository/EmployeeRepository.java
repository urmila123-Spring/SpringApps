package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Employee;

public interface EmployeeRepository extends JpaRepository<Employee
	, Long> {
	


}
	


