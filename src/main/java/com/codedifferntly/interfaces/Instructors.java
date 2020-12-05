package com.codedifferntly.interfaces;

import java.util.Arrays;
import java.util.List;

public class Instructors extends People<Instructor>{
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

    //Todo  This may not be right....

    @Override
    Instructor[] getArray() {
        List<Object> objList = Arrays.asList(Students.getInstance().getArray());
        Instructor[] stuArray = new Instructor[objList.size()];
        objList.toArray(stuArray);

        return stuArray;
    }
}
