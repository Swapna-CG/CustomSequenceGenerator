package com.example.customsequencegenerator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customsequencegenerator.entity.Employee;
import com.example.customsequencegenerator.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return empRepo.save(emp);
		
	}
	
	@GetMapping("/showemployees")
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}

}
