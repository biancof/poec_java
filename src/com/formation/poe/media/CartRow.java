package com.formation.poe.media;

public class CartRow {

    private IMedia m;
    private int n = 1;

    public CartRow(){
    }

    public CartRow(IMedia m){
        this.m = m;
    }

    public void increment(){
        ++this.n;
    }

    public void decrement(){
        if (n >= 1)
        {
            --this.n;
        }
        else
        {
            System.out.println("Quantity error");
        }

    }

    public double getNetPrice()
    {
        return this.m.getNetPrice() * this.n;
    }

    public IMedia getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    // toString()

    public String toString() {
        return "Title: \"" + this.m.getTitle() + "\"; quantity: " + this.n;
    }
}
