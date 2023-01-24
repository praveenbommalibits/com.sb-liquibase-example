package com.liquibase.services;

import com.liquibase.entitites.Employee;
import com.liquibase.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Stream<Employee> getAllEmployees() {
        return StreamSupport.stream(employeeRepository.findAll().spliterator(), true);
    }
}
