package com.bdg.bookstorage.ekirakosyan.entity;

import com.bdg.bookstorage.ekirakosyan.common.Gender;

public class Author {

    private int id;
    private String name;
    private String surname;
    private Gender gender;

    public Author(final int id, final String name, final String surname, final Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }
}
