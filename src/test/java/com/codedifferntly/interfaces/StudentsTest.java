package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void testGetInstance() {
        //GIVEN I add Linda to my Students INSTANCE variable
        Person linda = new Person(123);
        Students.getInstance().add(linda);
        //WHEN
        Person actual = linda;
        System.out.println(actual);

        Person expected = Students.getInstance().findByID((long)123);
        System.out.println(expected);

        //THEN
        Assert.assertEquals(expected, actual);
    }
}