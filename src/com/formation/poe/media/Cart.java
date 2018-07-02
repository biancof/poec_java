package com.formation.poe.media;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    // attributes

    private List<CartRow> cartRowList = new ArrayList<>();

    // no constructor

    // methods

    public void add(CartRow c)
    {
        this.cartRowList.add(c);
    }

    public void remove(CartRow c)
    {
        this.cartRowList.remove(c);
    }

    public void addMedia(IMedia m){
        boolean isIncart = false;
        for (CartRow r : this.cartRowList)
        {
            if (m == r.getM())
            {
                r.increment();
                isIncart = true;
            }
        }
        if (!isIncart)
        {
            this.cartRowList.add(new CartRow(m));
        }
    }

    public void removeMedia(IMedia m){
        for (CartRow r : this.cartRowList)
        {
            if (m == r.getM())
            {
                if (r.getN() <= 1)
                {
                    this.cartRowList.remove(r);
                    break;
                }
                else
                {
                    r.decrement();
                    break;
                }
            }
        }
    }

    public void display(){
        System.out.println("Content of the cart:\n");
        for(CartRow r : this.cartRowList)
        {
            System.out.println(r);
        }
    }

    public double getTotalNetPrice()
    {
        double totalNetPrice = 0;
        for (CartRow c : this.cartRowList)
        {
            totalNetPrice += c.getNetPrice();
        }
        return totalNetPrice;
    }

    // getter

    public List<CartRow> getMediaRowList() {
        return this.cartRowList;
    }

    public int itemNum(){
        int itemNum = 0;
        for (CartRow r : this.cartRowList){
            itemNum += r.getN();
        }
        return itemNum;
    }

    // toString()

    public String toString() {
         return "Cart: " + this.itemNum() + " items, "+ getTotalNetPrice() + " Eur. (VAT incl.)";
    }
}
