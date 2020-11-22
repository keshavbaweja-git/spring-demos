package com.example.jpa_demo_paging.repository;

import com.example.jpa_demo_paging.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PersonRepository extends PagingAndSortingRepository<Person, String> {
    List<Person> findByLastName(String lastName);

    Page<Person> findByLastName(String lastName, Pageable pageable);
}
