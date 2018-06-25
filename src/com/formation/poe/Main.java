package com.formation.poe;

public class Main {
    public static void main(String[] args) {
        int[] tab = {2, 3, 4};
        System.out.println(recMult(tab, tab.length));
    }

    // method recursive multiplication

    public static int recMult (int[] tab, int n)
    {
        if (n == 1)
        {
            return tab[0];
        }
        else
        {
            return tab[n - 1] * recMult(tab, n - 1);
        }
    }
}
