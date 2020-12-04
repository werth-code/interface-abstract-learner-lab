package com.codedifferntly.interfaces;

import java.util.ArrayList;

//// TODO: 12/4/20 Add type params to methods? GENERICS

public class People<E> { //// TODO: 12/4/20 Make Abstract??
    private ArrayList<Person> personList;

    public People () {
        this.personList = new ArrayList<>();
    }

    public <E> void add(Person person) {
        personList.add(person);
    }

    public <E> Person findByID(Long id) {
        for(Person person : personList) {
            if(id.equals(person.getId())) return person;
        }
        return null;
    }

    public <E> void remove(Person person) {
        personList.remove(person);
    }

    public <E> void remove(Long id) {
        for (Person person: personList) {
            if(id.equals(person.getId())) personList.remove(person);
            break;
        }
    }

    public <E> Integer getCount() {
        return personList.size();
    }

    public <E> Object[] getArray() {
        return personList.toArray();
    }

    public <E> void removeAll() {
        personList.clear();
    }


}
