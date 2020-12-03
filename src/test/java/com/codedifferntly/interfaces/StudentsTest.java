package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void testGetInstance() {
        //GIVEN I add Linda to my Students INSTANCE variable
        Person linda = new Person("Linda", 123);
        Students.getInstance().add(linda);
        //WHEN
        Person actual = linda;
        System.out.println(actual);

        System.out.println(Students.getInstance().getCount());

        Person expected = Students.getInstance().findByID((long)123);
        System.out.println(expected);

        //THEN
        Assert.assertEquals(expected, actual);
    }
}