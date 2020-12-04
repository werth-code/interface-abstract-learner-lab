package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void testGetINSTANCE() {
        //WHEN
        Integer actual = Instructors.getInstance().getCount();
        System.out.println(actual);
        Integer expected = 4;

        //THEN
        Assert.assertEquals(expected, actual);
    }
}