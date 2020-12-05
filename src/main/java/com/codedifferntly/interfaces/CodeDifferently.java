package com.codedifferntly.interfaces;


import com.sun.tools.javac.jvm.Code;

import java.util.Arrays;
import java.util.List;

// TODO: 12/4/20 Should we get our instances first and set them to these variables?
// If our methods are static and cannot use these variables, why do we have them?

public class CodeDifferently {
    private  static CodeDifferently instance = null;
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private CodeDifferently() {
    }

    public static CodeDifferently getInstance() {
        if(instance == null) return null;
            instance = new CodeDifferently();
        return instance;
    }

    public static void hostLecture(Teacher teacher, Double numberOfHours) {
//        //Take the INSTANCE and turn it into an array and then a list. //// TODO: 12/5/20 previously working code
//        List<Object> objList = Arrays.asList(Students.getInstance().getArray());
//        //Create a new Array of Students that is the same size as our LIST.
//        Student[] stuArray = new Student[objList.size()];
//        //Use objList.toArray() to pass in our stuArray.
//        objList.toArray(stuArray);

        teacher.lecture(Students.getInstance().getArray(), numberOfHours);
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
