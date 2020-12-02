package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    Student student;

    @Before
    public void setUp() {
        student = new Student(123456789);
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        //GIVEN
        Person studentIsAPerson = new Student(222222);
        System.out.println(studentIsAPerson.id);
        //WHEN
        long expected = 222222;
        long actual = studentIsAPerson.getId();
        //THEN
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testLearn() {
        //GIVEN
        student.learn(2.0);
        //WHEN
        double expected = 2.0;
        double actual = student.getTotalStudyTime();
        System.out.println(actual);
        //THEN
        Assert.assertEquals(expected, actual, 0.1);
    }
}