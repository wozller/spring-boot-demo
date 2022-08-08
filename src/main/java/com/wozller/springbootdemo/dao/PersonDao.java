package com.wozller.springbootdemo.dao;

import com.wozller.springbootdemo.model.Person;

import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    // This will allow us to generate the UUID ourselves.
    default int addPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
