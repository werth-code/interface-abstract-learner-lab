package com.codedifferntly.interfaces;

public class Student extends Person implements Learner {
    double totalStudyTime;

    public Student(long id) {
        super(id);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
