package com.formation.poe.media;

import java.util.ArrayList;

public class Author {

    // attributes

    private int id;
    private String name;
    private String surname;

    // constructors

    public Author(){
    }

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Author(int id, String name, String surname){
        this(name, surname);
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // getters & setters

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

    // toString()

    public String toString(){
        return name + " " + surname;
    }
}
