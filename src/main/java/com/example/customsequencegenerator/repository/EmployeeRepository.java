package com.example.customsequencegenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customsequencegenerator.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
