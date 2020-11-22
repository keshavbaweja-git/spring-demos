package com.example.jpa_demo_paging.service;

import com.example.jpa_demo_paging.model.Person;
import com.example.jpa_demo_paging.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceDefault implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person persist(Person person) {
        return (Person) personRepository.save(person);
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        return personRepository.findByLastName(lastName);
    }

    @Override
    public List<Person> findByLastName(String lastName, Pageable pageable) {
        return personRepository.findByLastName(lastName, pageable).getContent();
    }

}
