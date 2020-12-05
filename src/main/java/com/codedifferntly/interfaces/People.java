package com.codedifferntly.interfaces;

import java.util.ArrayList;

abstract class People<E extends Person> {
    private ArrayList<E> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public void add(E person) {
        personList.add(person);
    }

    public <E> Person findByID(Long id) {
        for(Person person : personList) {
            if(id.equals(person.getId())) return person;
        }
        return null;
    }

    public void remove(E person) {
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

    abstract E[] getArray();

    public  void removeAll() {
        personList.clear();
    }


}
