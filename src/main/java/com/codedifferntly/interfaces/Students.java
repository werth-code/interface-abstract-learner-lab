package com.codedifferntly.interfaces;

public class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students() {
        add(new Student("Matt", 000));
        add(new Student("Ray", 001));
        add(new Student("Danielle", 002));
        add(new Student("Mike", 003));
        add(new Student("Sam", 004));
        add(new Student("Amirah", 005));
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
