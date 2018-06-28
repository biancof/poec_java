package com.formation.poe.BaseAzotee;

import java.util.ArrayList;

public class RNA {

    // Attributes

    private ArrayList<Base> strand = new ArrayList<>();

    // Constructors

    public RNA(){
    }

    public RNA(String code){
        strand = setStrand(code);
    }

    public String toString(){
        String res = "";
        for(Base b  : strand){
            res += b.getSymbol();
        }
        return res;
    }

    public ArrayList<Base> setStrand(String code){
        for (int i = 0 ; i < code.length() ; ++i){
            Base b = new Base(code.substring(i, i + 1));
            strand.add(b);
        }
        return strand;
    }

    // getters

    public ArrayList<Base> getStrand() {
        return strand;
    }

    // Methods


//    public ArrayList<String> translate(ArrayList<String> brin) {
//        ArrayList<String> aminoacid = new ArrayList<>(String);
//
//        return aminoacid;
//    }

    public void translateCodon(String codon)
    {
        String triple = "";
        boolean res = false;
        for(int i = 0 ; i < this.strand.size() ; i += 3)
        {
//            String triple = "";
            for(int j = i ; j < i + 3 ; ++j)
            if (!(j >= this.strand.size()))
            {
                {
                    triple = triple + this.strand.get(i).getSymbol();
                }
                if (codon.equals(triple)){
                    res = true;
                }
            }
            System.out.println("Triple = " + triple);
            triple = "";
        }
//        return res;
        System.out.println("Triple = fanculo");
    }


}
