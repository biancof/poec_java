package com.formation.poe.genetics;

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
                break;
            default:
                System.out.println("Error");
        }
    }

    // getters

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    // methods

    public Base getMatch(boolean isRNA){
        String symbol = "";
        switch(this.symbol)
        {
            case "A":
                if (isRNA) {
                    symbol = "U";
                }
                else
                {
                    symbol = "T";
                }
                break;
            case "T":
                symbol = "A";
                break;
            case "C":
                symbol = "G";
                break;
            case "G":
                symbol = "C";
                break;
            case "U":
                symbol = "A";
                break;
            default:
                System.out.print("Error: Base " + symbol + " doesn't match with any base");
        }
        return new Base(symbol);
    }

    @Override
    public String toString() {
        return "Base " + this.symbol + ": " + this.name + " (" + this.family + ")";
    }
}


