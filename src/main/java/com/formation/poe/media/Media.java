package com.formation.poe.media;

import java.util.ArrayList;
import java.util.List;

public abstract class Media implements IMedia {

    // attributes

    private int id;
    private String title;
    private double price; // price without VAT
    private double vatRate = 20; // standard VAT rate (20 %)
    private double discount = 0;	// percentage of discout on net (VAT incl.) price
    private List<Author> authorList = new ArrayList<>();
    private Publisher publisher;

    // constructors

    public Media(){
    }

    public Media(int id, String title, double price){
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Media(int id, ArrayList<Author> authorList, String title, double price, Publisher publisher){
        this(id, title, price);
        this.authorList = authorList;
    }

    // methods
    
    // Calculates the net price of the item.
    // Net price is intended as final price (+VAT - discount)

    // getters & setters

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public double getVatRate() {
        return vatRate;
    }

    @Override
    public void setVatRate(double vatRate) {
        this.vatRate = vatRate;
    }
    
    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    @Override
    public List<Author> getAuthorList() {
        return authorList;
    }

    @Override
    public void setAuthorList(List<Author> authors) {
        this.authorList = authorList;
    }

    @Override
    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    // toString()

    @Override
    public String toString(){
        String authors = "";
        for (int i = 0 ; i < this.authorList.size() ; ++i) {
            authors = authors + this.authorList.get(i) + ", ";
        }
        return authors + "\"" + title + "\", " + publisher + ", " + this.getNetPrice() + " Euro (VAT incl.)";
    }
}
