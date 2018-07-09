//package com.formation.poe.media;
//
//import java.util.ArrayList;
//
//public class CD extends Media {
//
//    // attributes
//
//    private int nTracks;
//
//    // constructors
//
//
//    public CD(){
//        super(); // this line is not necessary
//    }
//
//
//    public CD(ArrayList<Author> authors, String title, double price){
//        super(authors, title, price);
//    }
//
//    // methods
//
//    @Override
//    public double getNetPrice() {
//        super.setVatRate(super.getVatRate());
//        super.setDiscount(0);
//        double netPrice = super.getPrice() * (super.getVatRate() + 100) / 100;	// price with VAT
//        netPrice *= (100 - super.getDiscount()) / 100;	// price with VAT and discount
//        return Math.round(netPrice);	// rounded net price
//    }
//
//    // getters & setters
//
//    public int getnTracks() {
//        return nTracks;
//    }
//
//    public void setnTracks(int nTracks) {
//        this.nTracks = nTracks;
//    }
//
//    // toString()
//
//    public String toString(){
//        return super.toString() + ", " + nTracks + " tracks";
//    }
//}
