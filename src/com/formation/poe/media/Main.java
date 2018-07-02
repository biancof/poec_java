package com.formation.poe.media;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        // Verification code
    	
    	// Set objects: medias, authors and publishers

        Author a1 = new Author("Francesco", "Bianco");
        ArrayList<Author> listAuthor1 = new ArrayList<>();
        listAuthor1.add(a1);

        Author a2 = new Author("Jiri", "Spicka");
        ArrayList<Author> listAuthor2 = new ArrayList<>();
        listAuthor2.add(a1);
        listAuthor2.add(a2);

        Author a3 = new Author("Vinicio", "Capossela");
        ArrayList<Author> listAuthor3 = new ArrayList<>();
        listAuthor3.add(a3);

        Author a4 = new Author("Terry", "Jones");
        ArrayList<Author> listAuthor4 = new ArrayList<>();
        listAuthor4.add(a4);

        Publisher p1 = new Publisher("Cesati");
        Publisher p2 = new Publisher("Python (Monty) Pictures Ltd");
        Publisher p3 = new Publisher("Atlantic Records");
        
        // Appearance of medias
        
        // Book as general Media
        
        /*Media m1 = new Media(listAuthor1, "Breve guida alla sintassi italiana", 10);
        m1.setPublisher(p1);	// set the publisher, which is not an argument
        System.out.println("Item # " + m1.getId() + " (Book as general Media): " + m1);
        System.out.println("Brut price = " + m1.getPrice() + " Euro (TVA excl.)\n");*/
        
        // Book as Book
        
        Book b1 = new Book(listAuthor2, "Perche' scrivere?", 48);
        b1.setNPages(120);	// set the number of pages, which is not an argument
        b1.setPublisher(p1); // set the publisher, which is not an argument
        System.out.println("Item # " + b1.getId() + " (Book): " + b1);
        System.out.println("Brut price = " + b1.getPrice() + " Euro (TVA excl.)\n");
        
        // CD as CD
        
        CD c1 = new CD(listAuthor3, "Ovunque proteggi", 20);
        c1.setnTracks(13);	// set the number of tracks, which is not an argument
        c1.setPublisher(p3);
        System.out.println("Item # " + c1.getId() + " (CD): " + c1);
        System.out.println("Net price = " + c1.getPrice() + " Euro (TVA excl.)\n");
        
        // DVD as DVD
        
        DVD d1 = new DVD(listAuthor4, "Life of Brian", 27);
        d1.setPublisher(p2);	// set the publisher, which is not an argument
        d1.setZone(2);	// set the DVD zone (0-8), which is not an argument
        System.out.println("Item # " + d1.getId() + " (DVD): " + d1);
        System.out.println("Net price = " + d1.getPrice() + " Euro (TVA excl.)\n");

        // Cart

        Cart cart1 = new Cart();
        System.out.println("[Test # 1: creation of an empty cart] " + cart1);

        cart1.add(b1);
        cart1.add(c1);
        cart1.add(d1);

        System.out.println("[Test # 2: add a book, a cd, and a dvd] " + cart1);
        cart1.remove(d1);
        System.out.println("[Test # 3: remove the dvd] " + cart1);
        cart1.add(b1);
        System.out.println("[Test # 4: add another copy of the book] " + cart1);
    }
}
