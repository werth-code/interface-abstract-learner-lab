package com.codedifferntly.interfaces;

import java.util.ArrayList;

public class People {
    private ArrayList<Person> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findByID(Long id) {
        for(Person person : personList) {
            if(id.equals(person.getId())) return person;
        }
        return null;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(Long id) {
        for (Person person: personList) {
            if(id.equals(person.getId())) personList.remove(person);
            break;
        }
    }

    public Integer getCount() {
        return personList.size();
    }

    public Object[] getArray() {
        return personList.toArray();
    }

    public void removeAll() {
        personList.clear();
    }


}
