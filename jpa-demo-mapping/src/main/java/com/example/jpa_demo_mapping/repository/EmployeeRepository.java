package com.example.jpa_demo_mapping.repository;

import com.example.jpa_demo_mapping.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
