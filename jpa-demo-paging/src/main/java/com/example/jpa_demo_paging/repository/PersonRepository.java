package com.example.jpa_demo_paging.repository;

import com.example.jpa_demo_paging.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, String> {
    List<Person> findByLastName(String lastName);
}
