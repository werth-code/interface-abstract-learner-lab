package com.codedifferntly.interfaces;

public class Student extends Person implements Learner {
    double totalStudyTime;

    public Student(String name, long id) {
        super(name, id);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
