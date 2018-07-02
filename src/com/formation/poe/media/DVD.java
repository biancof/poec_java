package com.formation.poe.media;

import java.util.ArrayList;

public class DVD extends Media {

    // attributes

    private int zone;

    // constructors

    public DVD(){
    }

    public DVD(ArrayList<Author> authors, String title, double price){
        super(authors, title, price);
    }
    
    // methods
    
    @Override
    public double getNetPrice(){	// price with VAT
    	super.setDiscount(20);
    	return super.getNetPrice();
    }
    
    // getters & setters
    
    public int getZone() {
        return zone;
    }

    public void setZone(int zone)
    {
        if ((zone < 0)||(zone > 8))
        {
        	zone = 0;
        }
    	this.zone = zone;
    }
}
