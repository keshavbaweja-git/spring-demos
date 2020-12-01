package com.example.jpa_demo_mapping.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private String id;

    private String name;

    @OneToOne
    @JoinColumn(name = "employee_id")
    @Setter
    private EmployeeDetail employeeDetail;


}
