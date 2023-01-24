package com.liquibase.repositories;

import com.liquibase.entitites.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company,Integer> {
}
