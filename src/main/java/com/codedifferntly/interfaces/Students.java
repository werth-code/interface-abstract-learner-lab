package com.codedifferntly.interfaces;

public class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students() {
        add(new Person("Matt", 000));
        add(new Person("Ray", 001));
        add(new Person("Danielle", 002));
        add(new Person("Mike", 003));
        add(new Person("Sam", 004));
        add(new Person("Amirah", 005));
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
