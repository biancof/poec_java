package com.formation.poe.BaseAzotee;

import java.util.ArrayList;

public class DNA {

    // Attributes

    private ArrayList<Base> strand = new ArrayList<>();

    // Constructors

    public DNA(){
    }

    public DNA(String code) {
        strand = setStrand(code);
    }

    // Methods

    private ArrayList<Base> setStrand(String code){
        for (int i = 0 ; i < code.length() ; ++i){
            Base b = new Base(code.substring(i, i + 1));
            strand.add(b);
        }
        return strand;
    }

    public RNA transcription(){
        RNA rna = new RNA();
        for (int i = 0 ; i < this.strand.size() ; ++i)
        {
            rna.getStrand().add(strand.get(i));
        }
        return rna;
    }

    // getters

    public ArrayList<Base> getStrand() {
        return strand;
    }

    // toString()

    public String toString(){
        String res = "";
        for(Base b  : strand){
            res = res + b.getSymbol();
        }
        return res;
    }

    public ArrayList<Base> getComplementary(){
        ArrayList<Base> comp = new ArrayList<Base>();
        for(Base b : strand)
        {
            comp.add(b.getMatch(false));
        }
        return comp;
    }

////    private String setComplementary(brin){
////        for (int i = 0 ; i <= 4 ; ++i){
////            Base b = new Base(brin.charAt(i));
////            this.complementary = this.complementary + b.getMatch();
////        }
////        return this.complementary;
//    }
}
