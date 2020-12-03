package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void testGetINSTANCE() {
        Instructor tariq = new Instructor("Tariq", 222);
        Instructor samantha = new Instructor("Samantha", 111);

        Instructors.getInstance().add(tariq);
        Instructors.getInstance().add(samantha);
        //WHEN
        Instructor actual = tariq;
        System.out.println(actual);

        System.out.println(Instructors.getInstance().getCount());

        Person expected = Instructors.getInstance().findByID((long)222);
        System.out.println(expected);

        //THEN
        Assert.assertEquals(expected, actual);
    }
}