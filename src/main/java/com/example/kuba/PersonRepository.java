package com.example.kuba;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;
public void createPerson(String name, Integer age) {
    Person person = new Person(name, age);
    entityManager.persist(person);
}

    public Person findById(Long id) {
        return entityManager.find(Person.class, id);
    }





}
