package com.liquibase.services;

import com.liquibase.entitites.Company;
import com.liquibase.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class CompanyServiceImpl implements CompanyService{

    private CompanyRepository companyRepository;
    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Stream<Company> getCompanies() {
        return StreamSupport.stream(companyRepository.findAll().spliterator(), true);
    }
}
