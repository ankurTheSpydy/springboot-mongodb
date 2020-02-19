package com.company.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.company.project.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
