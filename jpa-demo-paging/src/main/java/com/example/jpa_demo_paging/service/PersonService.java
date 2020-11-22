package com.example.jpa_demo_paging.service;

import com.example.jpa_demo_paging.model.Person;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonService {
    Person persist(Person person);
    List<Person> findByLastName(String lastName);
    List<Person> findByLastName(String lastName, Pageable pageable);
}
