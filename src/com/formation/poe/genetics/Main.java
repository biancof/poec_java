package com.formation.poe.genetics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // verification code for the class Base

        Base b1 = new Base("A");
        System.out.println(b1);

        System.out.println(b1.getMatch(true));

        DNA dna1 = new DNA("AAAAAAATTCGA");
        RNA rna1 = dna1.transcript();

        System.out.println(dna1);
        System.out.println(rna1);

        //System.out.println(rna1.getStrand().toString());


        Ribosome rib1 = new Ribosome(rna1);

        System.out.println(rib1.translate(rna1));






    }
}
