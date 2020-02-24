package com.company.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
//@Document(collection = "Address")
public class Address {

//	@Id
//	String id;
	String flatNo;
	String society;
	String city;
}
