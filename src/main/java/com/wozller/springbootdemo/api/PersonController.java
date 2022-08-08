package com.wozller.springbootdemo.api;

import com.wozller.springbootdemo.model.Person;
import com.wozller.springbootdemo.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
