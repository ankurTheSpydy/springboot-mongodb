package com.company.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Employees")
public class Employee {

	@Id
	int _id;
	String name;
	String managerName;
	String department;
	Address address;
}
