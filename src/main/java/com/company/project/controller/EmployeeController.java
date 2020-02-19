package com.company.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.project.model.Employee;
import com.company.project.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository er;
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee e) {
		er.save(e);
		return "Employee saved with id = " + e.get_id();
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return er.findAll();
	}
	
	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id) {
		return er.findById(id);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		er.deleteById(id);
		return "Employee with id " + id + " deleted";
	}
}
