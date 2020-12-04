package com.codedifferntly.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CodeDifferently {
    private Students students;
    private Instructors instructors;

    private CodeDifferently() {
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    // TODO: 12/4/20 Can't figure out how to iterate through these...?? Single Instance Works.
    // casting issues..

    public static void hostLecture(Teacher teacher, Double numberOfHours) {
        //Take the INSTANCE and turn it into an array and then a list.
        List<Object> objList = Arrays.asList(Students.getInstance().getArray());

        //Create a new Array of Students that is the same size as our LIST.
        Student[] stuArray = new Student[objList.size()];
        //Use objList.toArray() to pass in our stuArray.
        objList.toArray(stuArray);

        //Loop through our new Array
        for(Student student : stuArray) {
            System.out.println(student);
        }

    }

    public static void hostLecture(long id, Double numberOfHours) {
////  identify a respective Instructor to host a lecture to the composite people field in the cohort reference.
    }

}
