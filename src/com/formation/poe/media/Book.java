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
        super.setVatRate(5);
        super.setDiscount(0);
        double netPrice = super.getPrice() * (super.getVatRate() + 100) / 100;	// price with VAT
        netPrice *= (100 - super.getDiscount()) / 100;	// price with VAT and discount
        return Math.round(netPrice);	// rounded net price
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
