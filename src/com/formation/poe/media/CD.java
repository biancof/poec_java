package com.formation.poe.media;

import java.util.ArrayList;

public class CD extends Media {

    // attributes

    private int nTracks;

    // constructors

    public CD(){
        super(); // this line is not necessary
    }

    public CD(ArrayList<Author> authors, String title, double price){
        super(authors, title, price);
    }

    // methods

    @Override
    public double getNetPrice(){	// price with VAT
    	return super.getNetPrice();
    }

    // getters & setters

    public int getnTracks() {
        return nTracks;
    }

    public void setnTracks(int nTracks) {
        this.nTracks = nTracks;
    }

    // toString()

    public String toString(){
        return super.toString() + ", " + nTracks + " tracks";
    }
}
