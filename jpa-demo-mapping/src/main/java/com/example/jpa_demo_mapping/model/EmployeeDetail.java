package com.example.jpa_demo_mapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String employeeId;

    private String type;



}
