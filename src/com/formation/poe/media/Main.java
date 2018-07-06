package com.formation.poe.media;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Verification code

        // Set objects: medias, authors and publishers

        Author a1 = new Author("Francesco", "Bianco");
        ArrayList<Author> listAuthor1 = new ArrayList<>();
        listAuthor1.add(a1);
//
//        Author a2 = new Author("Jiri", "Spicka");
//        ArrayList<Author> listAuthor2 = new ArrayList<>();
//        listAuthor2.add(a1);
//        listAuthor2.add(a2);
//
//        Author a3 = new Author("Vinicio", "Capossela");
//        ArrayList<Author> listAuthor3 = new ArrayList<>();
//        listAuthor3.add(a3);
//
//        Author a4 = new Author("Terry", "Jones");
//        ArrayList<Author> listAuthor4 = new ArrayList<>();
//        listAuthor4.add(a4);
//
        Publisher p1 = new Publisher("Cesati");
//        Publisher p2 = new Publisher("Python (Monty) Pictures Ltd");
//        Publisher p3 = new Publisher("Atlantic Records");
//
//        // Appearance of medias
//
//        // Book as general Media
//
//        /*Media m1 = new Media(listAuthor1, "Breve guida alla sintassi italiana", 10);
//        m1.setPublisher(p1);	// set the publisher, which is not an argument
//        System.out.println("Item # " + m1.getId() + " (Book as general Media): " + m1);
//        System.out.println("Brut price = " + m1.getPrice() + " Euro (TVA excl.)\n");*/
//
//        // Book as Book
//
//        Book b1 = new Book(listAuthor2, "Perche' scrivere?", 48);
//        b1.setNPages(120);    // set the number of pages, which is not an argument
//        b1.setPublisher(p1); // set the publisher, which is not an argument
//        System.out.println("Item # " + b1.getId() + " (Book): " + b1);
//        System.out.println("Brut price = " + b1.getPrice() + " Euro (TVA excl.)\n");
//
        Book b2 = new Book(listAuthor1, "Studi linguistici sull'emigrazione", 20);
        b2.setNPages(200);
        b2.setPublisher(p1);
        System.out.println("Item # " + b2.getId() + " (Book): " + b2);
        System.out.println("Brut price = " + b2.getPrice() + " Euro (TVA excl.)\n");
//
//        // CD as CD
//
//        CD c1 = new CD(listAuthor3, "Ovunque proteggi", 20);
//        c1.setnTracks(13);    // set the number of tracks, which is not an argument
//        c1.setPublisher(p3);
//        System.out.println("Item # " + c1.getId() + " (CD): " + c1);
//        System.out.println("Net price = " + c1.getPrice() + " Euro (TVA excl.)\n");
//
//        // DVD as DVD
//
//        DVD d1 = new DVD(listAuthor4, "Life of Brian", 27);
//        d1.setPublisher(p2);    // set the publisher, which is not an argument
//        d1.setZone(2);    // set the DVD zone (0-8), which is not an argument
//        System.out.println("Item # " + d1.getId() + " (DVD): " + d1);
//        System.out.println("Net price = " + d1.getPrice() + " Euro (TVA excl.)\n");
//
//        // Cart
//
//        Cart cart1 = new Cart();
//        System.out.println("[Test # 1: creation of an empty cart] " + cart1);
//        System.out.print("[Test # 1: creation of an empty cart] " + cart1);
//
//        try {
//            cart1.validate();
//        } catch (MediaException e) {
//            System.out.println("\n" + e + "\n");
//        }
//
//        cart1.addMedia(b1);
//        cart1.addMedia(c1);
//        cart1.addMedia(d1);
//
//        System.out.println("[Test # 2: add a book, a cd, and a dvd] " + cart1);
//        cart1.removeMedia(d1);
//        System.out.println("[Test # 3: remove the dvd] " + cart1);
//        cart1.addMedia(b1);
//        System.out.println("[Test # 4: add another copy of the book] " + cart1);
//
//        System.out.println();
//
//        cart1.display();
//
//        System.out.println();
//
//        try {
//            cart1.validate();
//        } catch (MediaException e) {
//            System.out.println("\n" + e + "\n");
//        }
//
//        System.out.println();

        // BookRepository

        BookRepository br1 = new BookRepository();
        System.out.println(br1);
        try {
            br1.load("books.csv");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println();

        System.out.println("Books in the repository:\n");
        for (Book b : br1.getAll()){
            System.out.println("Book # " + b.getId() + ": " + b);
        }

        System.out.println();

        System.out.println(br1);

        System.out.println();

        System.out.println("\nSearch the book with id 2:");
        System.out.println(br1.getById(10));

        System.out.println("\nSearch all books with string \"Della\" " +
                "(not case sensitive) within the title:");
        for (Book b : br1.getByTitle("della")){
            System.out.println(b);
        }

        System.out.println("\nSearch all books whose (net) price is not higher than 12 Euro:");
        for (Book b : br1.getByPrice(12)){
            System.out.println(b);
        }

        System.out.println("\nSearch all books with string \"OMPI\" " +
                "(not case sensitive) within the name of the publisher:");
        for (Book b : br1.getByPublisher("OMPI")){
            System.out.println(b);
        }

        File file = new File("books.csv");

//        if(file.delete())
//        {
//            System.out.println("File deleted successfully");
//        }
//        else
//        {
//            System.out.println("Failed to delete the file");
//        }

//        try{
//            br1.add(b2);
//        }
//        catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IOException ex) {
//        ex.printStackTrace();
//        }

//        System.out.println();
//
//        System.out.println(br1);




    }

}
