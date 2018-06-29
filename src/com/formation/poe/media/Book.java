package com.formation.poe.media;

import java.util.ArrayList;

public class Book extends Media {

    // attributes

    private int nPages;

    // constructors

    public Book(){
        super(); // this line is not necessary
    }

    public Book(ArrayList<Author> authors, String title, double price){
        super(authors, title, price);
    }

    // methods

    @Override
    public double getNetPrice() {
        return Math.round(super.getPrice() / 1.05);
    }

    // toString()

    public String toString(){
        return super.toString() + ", " + nPages + " pages";
    }

    public int getNPages() {
        return nPages;
    }

    public void setNPages(int nPages) {
        this.nPages = nPages;
    }
}
