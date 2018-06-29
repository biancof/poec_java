package com.formation.poe.media;

public class Publisher {

    private static int id;
    private String name;

    public Publisher(){

    }

    public Publisher(String name){
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Publisher.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}
