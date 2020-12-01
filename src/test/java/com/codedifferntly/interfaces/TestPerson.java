package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson  {

    @Test
    public void testConstructor() {
        //GIVEN
        Person person = new Person(123456789);
        //WHEN
        long expected = 123456789;
        long actual = person.getId();
        System.out.println(actual);
        //THEN
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testTestSetName() {
        //GIVEN
        Person person = new Person(123456789);
        person.setName("Matt");
        //WHEN
        String expected = "Matt";
        String actual = person.getName();
        System.out.println(actual);
        //THEN
        Assert.assertEquals(expected, actual);
    }
}