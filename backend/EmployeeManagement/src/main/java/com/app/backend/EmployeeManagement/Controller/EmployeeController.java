package com.app.backend.EmployeeManagement.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.backend.EmployeeManagement.Model.Employee;
import com.app.backend.EmployeeManagement.Repository.EmployeeRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	private EmployeeRepository repository;
	
	public EmployeeController(EmployeeRepository repository) {
		this.repository=repository;
	}
	
	@GetMapping("/list")
	public List<Employee> getListOfEMployees(){
		return repository.findAll();
		
	}

}
