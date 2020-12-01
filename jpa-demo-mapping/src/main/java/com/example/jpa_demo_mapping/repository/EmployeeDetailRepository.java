package com.example.jpa_demo_mapping.repository;

import com.example.jpa_demo_mapping.model.EmployeeDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDetailRepository extends JpaRepository<EmployeeDetail, String> {
}
