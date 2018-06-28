package com.formation.poe.BaseAzotee;

public class AminoAcid {

    // Attributes

    private String symbol = "";
    private String trigram = "";
    private String name = "";

    // Constructor

    public AminoAcid(String symbol)
    {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getTrigram() {
        return trigram;
    }

    public String getName() {
        return name;
    }
}
