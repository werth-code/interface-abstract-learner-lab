package com.codedifferntly.interfaces;

public interface Teacher {
    default void teach(Learner learner, double numberOfHours){}
    default void lecture(Learner[] learners, double numberOfHours){}
}
