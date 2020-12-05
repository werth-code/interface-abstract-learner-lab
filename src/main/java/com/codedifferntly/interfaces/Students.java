package com.codedifferntly.interfaces;

import java.util.Arrays;
import java.util.List;

public class Students extends People<Student> {
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

    //TODO  cannot call itself to turn into an array!

    @Override
    public Student[] getArray() {
        //Student[] stuArray = Arrays.copyOf(Students.getInstance(), Students.getInstance().getCount(), Student[].class);

        List<Object> objList = Arrays.asList(Students.getInstance());
        Student[] stuArray = new Student[objList.size()];
        objList.toArray(stuArray);

        Arrays.stream(stuArray).forEach(ele -> System.out.println(ele));

        return stuArray;
    }
}

