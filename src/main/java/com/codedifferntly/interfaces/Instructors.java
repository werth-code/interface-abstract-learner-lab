package com.codedifferntly.interfaces;

public class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        add(new Person("Tariq", 001));
        add(new Person("Faith", 002));
        add(new Person("Gabby", 003));
        add(new Person("Stephen", 004));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
