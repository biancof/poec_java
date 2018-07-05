package com.formation.poe.genetics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class NucleicAcid {

    private ArrayList<Base> strand = new ArrayList<>();

    // Constructors

    public NucleicAcid(){
    }

    public NucleicAcid(String code) {
        this.strand = this.setStrand(code);
    }

    private ArrayList<Base> setStrand(String code){ // I'm not sure yet if it has to be defined here
        for (int i = 0 ; i < code.length() ; ++i){
            Base b = new Base(code.substring(i, i + 1));
            this.strand.add(b);
        }
        return strand;
    }

    // getters

    public ArrayList<Base> getStrand() {
        return this.strand;
    }

    // toString()

    public String toString(){
        String res = "";
        for(Base b : this.strand){
            res = res + b.getSymbol();
        }
        return res;
    }
}
