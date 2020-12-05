package com.codedifferntly.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CodeDifferently {
    private Students students;
    private Instructors instructors;

    // TODO: 12/4/20 Should we get our instances first and set them to these variables?

    private CodeDifferently() {
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public static void hostLecture(Teacher teacher, Double numberOfHours) {
        //Take the INSTANCE and turn it into an array and then a list.
        List<Object> objList = Arrays.asList(Students.getInstance().getArray());
        //Create a new Array of Students that is the same size as our LIST.
        Student[] stuArray = new Student[objList.size()];
        //Use objList.toArray() to pass in our stuArray.
        objList.toArray(stuArray);

        teacher.lecture(stuArray, numberOfHours);
    }

    public static void hostLecture(long id, Double numberOfHours) {
        //Take the INSTANCE and turn it into an array and then a list.
        List<Object> objList = Arrays.asList(Students.getInstance().getArray());
        //Create a new Array of Students that is the same size as our LIST.
        Student[] stuArray = new Student[objList.size()];
        //Use objList.toArray() to pass in our stuArray.
        objList.toArray(stuArray);

        Teacher teacher = (Teacher) Instructors.getInstance().findByID(id);

        teacher.lecture(stuArray, numberOfHours);
    }

}
