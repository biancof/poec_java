package com.formation.poe.BaseAzotee;

public class Base {

    // Attributes

    private String symbol = "";
    private String name = "";
    private String family = "";

    // Constructors

    public Base(){
    }

    public Base(String symbol) {
        this.symbol = symbol.toUpperCase();
        switch (this.symbol) {
            case "A":
                name = "adenine";
                family = "purines";
                break;
            case "T":
                name = "thymine";
                family = "pyrimidines";
                break;
            case "U":
                name = "uracile";
                family = "pyrimidines";
                break;
            case "C":
                name = "cytosine";
                family = "pyrimidines";
                break;
            case "G":
                name = "guanine";
                family = "purines";
            default:
                System.out.println("Error");
        }
    }

    public Base getMatch(boolean isRNA){
        switch(symbol)
        {
            case "A":
                if (isRNA) {
                    return new Base("U");
                    break;
                }
                else
                {
                    return new Base("T");
                    break;
                }
                break;
            case "T":
                return new Base("A");
                break;
            case "C":
                return new Base("G");
                break;
            case "G":
                return new Base("C");
            case "U":
                return new Base("A");
            default:
                System.out.print("Error: Base " + symbol + " doesn't match with any base");
        }
    }

    // getters

    public String getSymbol() {
        return symbol;
    }

    private String getName() {
        return name;
    }

    private String getFamily() {
        return family;
    }

//    public String getMatch() {
//        return match;
//    }

    // toString()

    public String toString(){
        return "Base " + symbol + " (" + name + ", from the family of " + family + ")";
    }

}
