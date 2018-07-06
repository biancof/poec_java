package com.formation.poe.genetics;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Ribosome {

    private RNA rna = new RNA();

    public Ribosome(){
    }

    public Ribosome(RNA rna){

    }

    public String translateCodon(String codon){

        Map<String,String> codonMap = new HashMap<>();
        codonMap.put("UUU","F");
        codonMap.put("UUC","F");
        codonMap.put("UUA","L");
        codonMap.put("UUG","L");
        codonMap.put("CUU","L");
        codonMap.put("CUC","L");
        codonMap.put("CUA","L");
        codonMap.put("CUG","L");
        codonMap.put("AUU","I");
        codonMap.put("AUC","I");
        codonMap.put("AUA","I");
        codonMap.put("AUG","M");
        codonMap.put("GUU","V");
        codonMap.put("GUC","V");
        codonMap.put("GUA","V");
        codonMap.put("GUG","V");
        codonMap.put("UCU","S");
        codonMap.put("UCC","S");
        codonMap.put("UCA","S");
        codonMap.put("UCG","S");
        codonMap.put("CCU","P");
        codonMap.put("CCC","P");
        codonMap.put("CCA","P");
        codonMap.put("CCG","P");
        codonMap.put("ACU","T");
        codonMap.put("ACC","T");
        codonMap.put("ACA","T");
        codonMap.put("ACG","T");
        codonMap.put("GCU","A");
        codonMap.put("GCC","A");
        codonMap.put("GCA","A");
        codonMap.put("GCG","A");
        codonMap.put("UAU","Y");
        codonMap.put("UAC","Y");
        codonMap.put("UAA"," "); // STOP
        codonMap.put("UAG"," "); // STOP
        codonMap.put("CAU","H");
        codonMap.put("CAC","H");
        codonMap.put("CAA","Q");
        codonMap.put("CAG","Q");
        codonMap.put("AAU","N");
        codonMap.put("AAC","N");
        codonMap.put("AAA","K");
        codonMap.put("AAG","K");
        codonMap.put("GAU","D");
        codonMap.put("GAC","D");
        codonMap.put("GAA","E");
        codonMap.put("GAG","E");
        codonMap.put("UGU","C");
        codonMap.put("UGC","C");
        codonMap.put("UGA"," "); // STOP
        codonMap.put("UGG","W");
        codonMap.put("CGU","R");
        codonMap.put("CGC","R");
        codonMap.put("CGA","R");
        codonMap.put("CGG","R");
        codonMap.put("AGU","S");
        codonMap.put("AGC","S");
        codonMap.put("AGA","R");
        codonMap.put("AGG","R");
        codonMap.put("GGU","G");
        codonMap.put("GGC","G");
        codonMap.put("GGA","G");
        codonMap.put("GGG","G");

        codon = codon.toUpperCase();

        String aminoAcidCode = codonMap.get(codon);

        return aminoAcidCode;
    }

    public String strandToString()
    {
        String str = "";
        for (Base b : this.rna.getStrand())
        {
            str += b.getSymbol();
        }
        return str;
    }

    public List<Protein> translate() {
        List<Protein> proteinList = new ArrayList<>();
        String strandToString = this.strandToString();
        String aminoAcidList = "";
        for (int i = 0 ; i < strandToString.length() ; i += 3) {
            if (i < strandToString.length() - 2) {
                aminoAcidList += this.translateCodon(strandToString.substring(i, i + 3));
            }
        }
        String[] proteins = aminoAcidList.split(" ");
        for (String str : proteins) {
            proteinList.add(stringToProtein(str));
        }
        return proteinList;
    }

    private Protein stringToProtein(String str) {
        Protein p = new Protein();
        for (int i = 0 ; i < str.length() ; ++i) {
            p.getAminoAcidList().add(new AminoAcid(str.substring(i, i + 1)));
        }
        return p;
    }
}
