package com.example.demoJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoJPA.modal.Employee;

import java.util.ArrayList;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    ArrayList<Employee> findAll();
}
