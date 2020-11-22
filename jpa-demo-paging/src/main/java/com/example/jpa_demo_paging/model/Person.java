package com.example.jpa_demo_paging.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@Entity
public class Person {

    @Id
    private final String id;
    private final String firstName;
    private final String lastName;
    private final int age;

    public Person() {
        this.id = "";
        this.firstName = "";
        this.lastName = "";
        this.age = -1;
    }

}
