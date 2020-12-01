package com.example.jpa_demo_mapping.repository;

import com.example.jpa_demo_mapping.model.Employee;
import com.example.jpa_demo_mapping.model.EmployeeDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeDetailRepository employeeDetailRepository;

    @Test
    @Transactional
    public void testInsert()
    {

        EmployeeDetail employeeDetail = new EmployeeDetail();
        employeeDetail.setType("Executive");
        Employee employee  = new Employee("1", "John", employeeDetail);
        employeeRepository.save(employee);


    }

}
