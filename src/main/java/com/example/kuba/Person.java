package com.example.kuba;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "age")
    private Integer age;
    @Column(name = "name")
    private String name;

    public Person(String name,Integer age) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{id="+id+"/name="+name+"/age="+age+"} ";
    }
}
