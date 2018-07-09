//package com.formation.poe.media;
//
//import java.util.ArrayList;
//
//public class DVD extends Media {
//
//    // attributes
//
//    private int zone;
//
//    // constructors
//
//    public DVD(){
//    }
//
//    public DVD(ArrayList<Author> authors, String title, double price){
//        super(authors, title, price);
//    }
//
//    // methods
//
//    @Override
//    public double getNetPrice() {
//        super.setVatRate(20);
//        super.setDiscount(20);
//        double netPrice = super.getPrice() * (super.getVatRate() + 100) / 100;	// price with VAT
//        netPrice *= (100 - super.getDiscount()) / 100;	// price with VAT and discount
//        return Math.round(netPrice);	// rounded net price
//    }
//
//    // getters & setters
//
//    public int getZone() {
//        return zone;
//    }
//
//    public void setZone(int zone)
//    {
//        if ((zone < 0)||(zone > 8))
//        {
//        	zone = 0;
//        }
//    	this.zone = zone;
//    }
//}
