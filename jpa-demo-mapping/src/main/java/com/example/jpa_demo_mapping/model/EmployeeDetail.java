package com.example.jpa_demo_mapping.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetail {

    @Id
    private String id;
    private String type;

    @OneToOne
    @MapsId
    private Employee employee;
}
