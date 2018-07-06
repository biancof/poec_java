package com.formation.poe.genetics;

import java.util.ArrayList;

public class DNA extends NucleicAcid {

    // Constructors

    public DNA(){
    }

    public DNA(String code){
        super(code);
    }

    // Methods

    // intermediate method, which can help to set both complementary and RNA strand

    private ArrayList<Base> transform(boolean isRNA) {
        ArrayList<Base> baseList = new ArrayList<>();
        for (Base b : this.getStrand()) {
            baseList.add(b.getMatch(isRNA));
        }
        return baseList;
    }

    public ArrayList<Base> getComplementary() {
        return this.transform(false);
    }

    public RNA transcript(){
        RNA rna = new RNA();
        ArrayList<Base> baseList = transform(true);
        for (Base b : baseList){
            rna.getStrand().add(b);
        }
        return rna;
    }

    // toString()

    public String toString(){
        return "DNA: " + super.toString();
    }
}

