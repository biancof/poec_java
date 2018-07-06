package com.formation.poe.genetics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class DNARepository {

    private String uri = "";
    private String dnaCode = "";

    public DNARepository(){
    }

    public DNARepository(String uri){
        this.uri = uri;
    }

    public DNA load() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(this.uri));
        this.dnaCode = reader.readLine();
        reader.close();
        return new DNA(this.dnaCode);
    }

    public void displayResult(){
        try {
            DNA dna = this.load();
            System.out.println("DNA loaded from file \"" + this.uri + "\"");
            System.out.println(dna);
            RNA rna = dna.transcript();
            Ribosome rib = new Ribosome();
            System.out.println(rna);
            System.out.println("Ribosome created");
            System.out.println("Proteins: " + rib.translate().size());
        } catch (Exception e) {
            System.out.println (e.toString());
        }


    }
}
