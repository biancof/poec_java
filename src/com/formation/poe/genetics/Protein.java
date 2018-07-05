package com.formation.poe.genetics;

import java.util.List;
import java.util.ArrayList;

public class Protein {

    private List<AminoAcid> aminoAcidList = new ArrayList<>();

    public Protein(){
    }

    // getters & setters

    public List<AminoAcid> getAminoAcidList() {
        return this.aminoAcidList;
    }

    public void setAminoAcidList(AminoAcid a){
        this.aminoAcidList.add(a);
    }

    // toString

    @Override
    public String toString(){
        return "Protein: " + aminoAcidList;
    }
}
