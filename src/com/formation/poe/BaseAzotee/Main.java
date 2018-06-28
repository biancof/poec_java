package com.formation.poe.BaseAzotee;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        // Verification code for the class Base

        Base a = new Base("A");
        Base t = new Base("T");
        Base u = new Base("U");
        Base g = new Base("g");
        Base c = new Base("C");
        System.out.println(a + "\n" + t + "\n" + u + "\n" + g + "\n" + c);

        // Verification code for the class DNA

        String code = "AAABBBCCCDDD";
        DNA pippo = new DNA(code);
        System.out.println(pippo.transcription());
        pippo.transcription().translateCodon("AAA");


//        System.out.println("Pippo = " + pippo.getBrin().get(0)); // + "\nComplementary = " + complementary);
//        System.out.println("DNA = " + code);
//        System.out.println("RNA = " + pippo.transcription());
//        boolean codon;
//        RNA franco = new RNA("AAATTTCCCPPBBBIU");
//        System.out.println(franco.translateCodon("AAT"));

//        // Temp experiment
//
//        String code = "ACTG";
//        ArrayList<String> brin = new ArrayList<String>();
//        String str = "";
//        for (int i = 0 ; i < brin.size() ; ++i)
//        {
//            str = (String) code.charAt(i);
//        }
//        brin.add(str);
//
//        System.out.println(str);
    }
}