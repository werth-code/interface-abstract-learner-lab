package com.codedifferntly.interfaces;

public class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        add(new Instructor("Tariq", 001));
        add(new Instructor("Faith", 002));
        add(new Instructor("Gabby", 003));
        add(new Instructor("Stephen", 004));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
