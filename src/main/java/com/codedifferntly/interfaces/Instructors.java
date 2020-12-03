package com.codedifferntly.interfaces;

public class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){}

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
