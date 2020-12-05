package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class CodeDifferentlyTest {


    @Test
    public void testHostLecture() {
//        CodeDifferently.hostLecture((Teacher) Instructors.getInstance().findByID(001L), 2.0); // TODO: 12/5/20 previously working code
//
//        List<Object> objList = Arrays.asList(Students.getInstance().getArray());
//        Student[] stuArray = new Student[objList.size()];
//        objList.toArray(stuArray);
//
//        double actual = stuArray[2].getTotalStudyTime();
//        double expected = 2.0;
//        System.out.println("We are calling the hostLecture method on our Student group and all Students should now have 2.0 totalStudyTime.");
//        System.out.println(actual);
//
//        Assert.assertEquals(expected, actual, 0.0);

        //GIVEN
        CodeDifferently.hostLecture((Teacher) Instructors.getInstance().findByID(001L), 2.0);
        //WHEN
        Student[] stuArray = Students.getInstance().getArray();
        Double actual = stuArray[0].getTotalStudyTime();
        Double expected = 2.0;
        //THEN
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testHostLectureID() {

        CodeDifferently.hostLecture(001L, 2.0);

        List<Object> objList = Arrays.asList(Students.getInstance().getArray());
        Student[] stuArray = new Student[objList.size()];
        objList.toArray(stuArray);

        double actual = stuArray[2].getTotalStudyTime();
        double expected = 2.0;
        System.out.println("We are calling the hostLecture method from a Teacher ID on our Student group and all Students should now have 2.0 totalStudyTime.");
        System.out.println(actual);

        Assert.assertEquals(expected, actual, 0.0);

    }
}