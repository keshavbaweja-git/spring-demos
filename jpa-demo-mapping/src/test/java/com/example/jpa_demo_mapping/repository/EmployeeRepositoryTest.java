package com.example.jpa_demo_mapping.repository;

import com.example.jpa_demo_mapping.model.Employee;
import com.example.jpa_demo_mapping.model.EmployeeDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeDetailRepository employeeDetailRepository;

    @Test
    public void testInsert()
    {

        Employee employee  = new Employee("1", "John", null);
        employee = employeeRepository.save(employee);
        EmployeeDetail employeeDetail = new EmployeeDetail(employee.getId(), "Executive", employee);
        employeeDetailRepository.save(employeeDetail);
        employee.setEmployeeDetail(employeeDetail);
        employeeRepository.save(employee);
        

    }

}
