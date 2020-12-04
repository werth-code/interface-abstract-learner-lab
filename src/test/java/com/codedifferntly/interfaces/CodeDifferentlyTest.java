package com.codedifferntly.interfaces;

import junit.framework.TestCase;
import org.junit.Before;

public class CodeDifferentlyTest extends TestCase {

    @Before
    public void setUp() {

    }

    public void testHostLecture() {
        CodeDifferently.hostLecture((Teacher) Instructors.getInstance().findByID(001L), 2.0);
    }

    public void testTestHostLecture() {
    }
}