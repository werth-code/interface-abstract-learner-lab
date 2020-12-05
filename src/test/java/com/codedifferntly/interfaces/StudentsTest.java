package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void testGetInstance() {
        //GIVEN I have an instance..
        //WHEN
        String actual = Students.getInstance().findByID((long)005).getName();
        System.out.println(actual);

        String expected = "Amirah";
        System.out.println(expected);

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetArray() {
        System.out.println(Students.getInstance().getArray().toString());
    }
}