package com.formation.poe.genetics;

public class AminoAcid {

    // attributes

    private String symbol;
    private String trigram;
    private String name;

    // constructor

    public AminoAcid(){
    }

    public AminoAcid(String symbol) {
        this.symbol = symbol.toUpperCase();
        switch (this.symbol) {
            case "A":
                this.trigram = "A";
                this.name = "A";
                break;
            case "C":
                this.trigram = "C";
                this.name = "C";
                break;
            case "D":
                this.trigram = "D";
                this.name = "D";
                break;
            case "E":
                this.trigram = "E";
                this.name = "E";
                break;
            case "F":
                this.trigram = "F";
                this.name = "F";
                break;
            case "G":
                this.trigram = "G";
                this.name = "G";
                break;
            case "H":
                this.trigram = "H";
                this.name = "H";
                break;
            case "I":
                this.trigram = "I";
                this.name = "I";
                break;
            case "K":
                this.trigram = "K";
                this.name = "K";
                break;
            case "L":
                this.trigram = "L";
                this.name = "L";
                break;
            case "M":
                this.trigram = "M";
                this.name = "M";
                break;
            case "N":
                this.trigram = "N";
                this.name = "N";
                break;
            case "P":
                this.trigram = "P";
                this.name = "P";
                break;
            case "Q":
                this.trigram = "Q";
                this.name = "Q";
                break;
            case "R":
                this.trigram = "R";
                this.name = "R";
                break;
            case "S":
                this.trigram = "S";
                this.name = "S";
                break;
            case "T":
                this.trigram = "T";
                this.name = "T";
                break;
            case "V":
                this.trigram = "V";
                this.name = "V";
                break;
            case "Y":
                this.trigram = "Y";
                this.name = "Y";
                break;
            case "W":
                this.trigram = "W";
                this.name = "W";
                break;
            case " ":
                this.trigram = " ";
                this.name = " ";
                break;
//            default:
//                System.out.println("Error");
        }
    }

    // getters

    public String getSymbol() {
        return symbol;
    }

    public String getTrigram() {
        return trigram;
    }

    public String getName() {
        return name;
    }

    // toString()

    @Override
    public String toString() {
        return this.symbol;
        //return "Aminoacid: " + this.symbol + "(" + this.name + ", " + this.trigram + ")";
    }
}
