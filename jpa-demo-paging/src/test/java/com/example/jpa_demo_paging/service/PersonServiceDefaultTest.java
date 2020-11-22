package com.example.jpa_demo_paging.service;

import com.example.jpa_demo_paging.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

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

    @Test
    public void testFindByLastName() {
        Person person = new Person("1", "Keshav", "Baweja", 25);
        personService.persist(person);
        Person personFound = personService.findByLastName("Baweja").get(0);
        assertThat(personFound.getId(), is(person.getId()));
        assertThat(personFound.getFirstName(), is(person.getFirstName()));
    }

    @Test
    public void testFindByLastNamePageable() {
        Person p1 = new Person("1", "Keshav", "Baweja", 25);
        personService.persist(p1);

        Person p2 = new Person("2", "Novak", "Baweja", 31);
        personService.persist(p2);

        List<Person> found = personService.findByLastName("Baweja", PageRequest.of(0,2));
        assertThat(found.size(), is(2));
    }

}
