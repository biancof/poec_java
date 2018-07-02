package com.formation.poe.media;

import java.util.ArrayList;

public class Author {

    // attributes

    private static int id;
    private String name;
    private String surname;

    // constructors

    public Author(){
        ++id;
    }

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
        ++id;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Author.id = id;
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
