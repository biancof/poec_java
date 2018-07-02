package com.formation.poe.media;

import java.util.ArrayList;

public abstract class Media {

    // attributes

    private static int id;
    private String title;
    private double price; // price without VAT
    private double vatRate = 20; // standard VAT rate (20 %)
    private double discount = 0;	// percentage of discout on net (VAT incl.) price
    private ArrayList<Author> authors = new ArrayList<>();
    private Publisher publisher;

    // constructors

    public Media(){
        ++id;
    }

    public Media(ArrayList<Author> authors, String title, double price){
        this.authors = authors;
        this.title = title;
        this.price = price;		
        ++id;
    }

    // methods
    
    // Calculates the net price of the item.
    // Net price is intended as final price (+VAT - discount)
    
    public abstract double getNetPrice();

    // getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getVatRate() {
        return vatRate;
    }

    public void setVatRate(double vatRate) {
        this.vatRate = vatRate;
    }
    
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    // toString()

    public String toString(){
        String authors = "";
        for (int i = 0 ; i < this.authors.size() ; ++i) {
            authors = authors + this.authors.get(i) + ", ";
        }
        return authors + "\"" + title + "\", " + publisher + ", " + this.getNetPrice() + " Euro (TVA incl.)";
    }
}
