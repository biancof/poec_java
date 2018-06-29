package com.formation.poe.media;

import java.util.ArrayList;

public class Media {

    // attributes

    private static int id;
    private String title;
    private double price; // brut price
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

    public double getNetPrice(){
        return Math.round(this.price / 1.2);
    }

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

    // toString()

    public String toString(){
        String authors = "";
        for (int i = 0 ; i < this.authors.size() ; ++i) {
            authors = authors + this.authors.get(i) + ", ";
        }
        return authors + "\"" + title + "\", " + publisher + ", " + price + " Euro (TVA incl.)";
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
}
