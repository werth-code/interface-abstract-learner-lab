package com.codedifferntly.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InstructorTest{
    Instructor instructor;
    Student student;
    Student student2;

    @Before
    public void setup() {
        instructor = new Instructor(001100);
        student = new Student(111111);
        student2 = new Student(222222);
    }

    @Test
    public void testImplementation(){
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        instructor.teach(student, 1.5);

        Double expected = 1.5;
        Double actual = student.getTotalStudyTime();
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        Learner[] students = {student, student2};
        instructor.lecture(students, 1.1);

        Double actual = student.getTotalStudyTime();
        Double actual2 = student2.getTotalStudyTime();
        System.out.println(actual);
        System.out.println(actual2);

        Double expected = 1.1;

        Assert.assertEquals(expected, actual2);
    }
}