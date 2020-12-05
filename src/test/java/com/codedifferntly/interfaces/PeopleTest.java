package com.codedifferntly.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PeopleTest extends TestCase {
    People people;
    Person person;
    ArrayList<Person> personArrayList;

    @Before
    public void setUp() {
        people = Students.getInstance();
        personArrayList = new ArrayList<>();
        person = new Person("Person", 1234567890);
    }

    @Test
    public void testAdd() {
        //GIVEN
        people.add(person);
        //WHEN
        long id = person.getId();
        Person actual = people.findByID(id);
        Person expected = person;
        System.out.println(expected);
        System.out.println(actual);
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindByID() {
        //GIVEN
        people.add(person);
        long id = person.getId();
        //WHEN

        Person actual = people.findByID(id);
        Person expected = person;
        System.out.println(actual);
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        //GIVEN
        people.add(person);
        long id = person.getId();
        //WHEN

        people.remove(person);
        Integer actual = personArrayList.size();
        Integer expected = 0;
        System.out.println(actual);
        //THEN

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTestRemove() {
        //GIVEN
        people.add(person);
        long id = person.getId();
        //WHEN

        people.remove(id);
        Integer actual = personArrayList.size();
        Integer expected = 0;
        System.out.println(actual);
        //THEN

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCount() {
        //GIVEN
        //WHEN
        Integer actual = people.getCount();
        Integer expected = 6;
        //THEN
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testGetArray() {
//        //GIVEN
//        //WHEN
//        System.out.println(Arrays.toString(people.getArray()));
//        Person[] actual = (Person[]) people.getArray();
//        String expected = "a";
//        //THEN
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void testRemoveAll() {
        //GIVEN
        people.add(person);
        //WHEN
        people.removeAll();
        String actual = Arrays.toString(people.getArray());
        String expected = "[]";
        //THEN
        Assert.assertEquals(expected, actual);
    }
}