package com.liquibase.repositories;

import com.liquibase.entitites.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
