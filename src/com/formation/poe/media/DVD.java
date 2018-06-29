package com.formation.poe.media;

import java.util.ArrayList;

public class DVD extends Media {

    // attributes

    private int zone;

    // constructors

    public DVD(){
    }

    public DVD(ArrayList<Author> authors, String title, double price){
        super(authors, title, price / 5 * 4);
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }
}
