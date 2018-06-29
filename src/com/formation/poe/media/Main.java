package com.formation.poe.media;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        // Verification code


        Author a1 = new Author("Francesco", "Bianco");
        ArrayList<Author> authors1 = new ArrayList<>();
        authors1.add(a1);

        Author a2 = new Author("Jiri", "Spicka");
        ArrayList<Author> authors2 = new ArrayList<>();
        authors2.add(a1);
        authors2.add(a2);

        Author a3 = new Author("Vinicio", "Capossela");
        ArrayList<Author> authors3 = new ArrayList<>();
        authors3.add(a3);

        Author a4 = new Author("Jacopo", "Spila");
        ArrayList<Author> authors4 = new ArrayList<>();
        authors4.add(a4);

        Publisher p1 = new Publisher("Cesati");

        Media m1 = new Media(authors1, "Breve guida alla sintassi italiana", 12);
        m1.setPublisher(p1);
        System.out.println(m1);
        System.out.println("Net price = " + m1.getNetPrice() + " Euro (TVA excl.)");

        Book b1 = new Book(authors1, "Breve guida alla sintassi italiana", 12);
        b1.setNPages(120);
        System.out.println(b1);
        System.out.println("Net price = " + b1.getNetPrice() + " Euro (TVA excl.)");

        CD c1 = new CD(authors3, "Ovunque proteggi", 20);
        System.out.println(c1);
        System.out.println("Net price = " + c1.getNetPrice() + " Euro (TVA excl.)");

        DVD d1 = new DVD(authors4, "Assassinio al Frustone", 27);
        System.out.println(d1);
        System.out.println("Net price = " + d1.getNetPrice() + " Euro (TVA excl.)");

        Media m2 = new Book(authors2, "Perche scrivere", 50);
        ((Book)m2).setNPages(120);
        System.out.println(m2);
        System.out.println("Net price = " + m2.getNetPrice() + " Euro (TVA excl.)");

    }
}
