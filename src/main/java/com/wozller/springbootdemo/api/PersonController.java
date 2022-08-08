package com.wozller.springbootdemo.api;

import com.wozller.springbootdemo.model.Person;
import com.wozller.springbootdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
