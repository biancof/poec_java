package com.formation.poe.genetics;

import java.util.ArrayList;

public class RNA extends NucleicAcid {

    // Constructors

    public RNA(){
    }

    public RNA(String code){
        super(code);
    }

    public String toString(){
        return "RNA: " + super.toString();
    }
}
