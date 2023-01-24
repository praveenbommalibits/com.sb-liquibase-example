package com.liquibase.entitites;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employess")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

}
