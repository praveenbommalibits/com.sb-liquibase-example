package com.liquibase.services;

import com.liquibase.entitites.Company;

import java.util.stream.Stream;

public interface CompanyService {
    Stream<Company> getCompanies();
}
