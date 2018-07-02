package com.formation.poe.media;

public class Publisher {

    // attributes
    
    private static int id;
    private String name;
    
    // constructors
    
    public Publisher(){

    }
    
    public Publisher(String name){
        this.name = name;
    }
    
    // toString();
    
    public String toString(){
        return this.name;
    }
    
    // getters & setters
    
    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
