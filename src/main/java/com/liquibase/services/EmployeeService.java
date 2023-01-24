package com.liquibase.services;

import com.liquibase.entitites.Employee;

import java.util.stream.Stream;

public interface EmployeeService {
    Stream<Employee> getAllEmployees();
}
