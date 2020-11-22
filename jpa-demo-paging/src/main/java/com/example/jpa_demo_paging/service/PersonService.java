package com.example.jpa_demo_paging.service;

import com.example.jpa_demo_paging.model.Person;

import java.util.List;

public interface PersonService {
    Person persist(Person person);
    List<Person> findByLastName(String lastName);
}
