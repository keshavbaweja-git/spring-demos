package com.example.jpa_demo_paging.service;

import com.example.jpa_demo_paging.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
public class PersonServiceDefaultTest {

    @Autowired
    private PersonService personService;

    @Test
    public void testPersist() {
        Person person = new Person("1", "Keshav", "Baweja", 25);
        Person personPersisted = personService.persist(person);
        assertThat(personPersisted.getId(), is(person.getId()));
        assertThat(personPersisted.getFirstName(), is(person.getFirstName()));
    }

}
