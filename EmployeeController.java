package com.saveoperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saveoperation.model.Employee;
import com.saveoperation.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")  //  http://localhost:8080/employee/save
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		
		Employee emp = employeeService.savEmployee(employee);
		return ResponseEntity.ok(emp);
		
	}

}
