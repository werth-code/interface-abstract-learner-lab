package com.codedifferntly.interfaces;

public class Person {
    final long id;
    private String name;

    public Person(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
