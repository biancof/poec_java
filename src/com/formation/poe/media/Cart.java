package com.formation.poe.media;

import java.util.ArrayList;

public class Cart {

    // attributes

    ArrayList<Media> mediaList = new ArrayList<>();

    // constructor

    public Cart(){
    }

    public Cart(ArrayList<Media> mediaList){

        this.mediaList = mediaList;

    }

    // methods

    public void add(Media m)
    {
        this.mediaList.add(m);
    }

    public void remove(Media m)
    {
        this.mediaList.remove(m);
    }

    public double getTotalNetPrice()
    {
        double totalNetPrice = 0;
        for (Media item : this.mediaList)
        {
            totalNetPrice += item.getNetPrice();
        }
        return totalNetPrice;
    }

    // toString()

    public String toString() {
         return "Cart: " + this.mediaList.size() + " items, "+ getTotalNetPrice() + " Eur. (VAT incl.)";
    }
}
