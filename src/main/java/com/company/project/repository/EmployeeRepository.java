package com.company.project.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.company.project.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

	@Query("{'_id' : ?0 }")
	Optional<Employee> findEmployeeById(int id);
}
