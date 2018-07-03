package com.formation.poe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functional {

    public static void main(String[] args){

        ArrayList<Double> l = new ArrayList<Double>
                (Arrays.asList(-6.1, 2.0, 167.00, 8.9, 4.0, 5.0, 3.1, -4.2, 8.0, 599.00));

        System.out.println("\nList of numbers = " + l + "\n");

        Stream s1 = l.stream().filter(x -> x % 2 == 0) ;
        System.out.println("Test # 1 (even numbers) = " + s1.collect(Collectors.toList()));

        Stream s2 = l.stream().filter(x -> x % 2 == 0).map(x -> Math.cos(x));
        System.out.println("Test # 2 (sinus of even numbers) = " + s2.collect(Collectors.toList()));

        Stream s3 = l.stream().filter(x -> isPrime(x));
        System.out.println("Test # 3 (prime numbers) = " + s3.collect(Collectors.toList()));

        Stream s4 = l.stream().filter(x -> isPrime(x)).map(x -> Math.tan(x)).filter(x -> x > 0);
        System.out.println("Test # 4 (positive values of tangent " +
                "of prime numbers) = " + s4.collect(Collectors.toList()));

        double n = 3.1;
        int nInt = (int) n;
        System.out.println("\nExtra test: if I cast " + n +
                ", in order to obtain an int, I obtain " + nInt);

        double i1 = l.stream().mapToDouble(x -> x).sum();

    }

    // methods

    // this method contains an error (see below, line comment),
    // which makes it work properly (I forgot to change once n into nInt)
    // it's a perfect example of serendipity

    public static boolean isPrime(double n) {
        int nInt = (int) n;
        boolean isPrime = true;
        if (nInt < 2) {
            isPrime = false;
        }
        for (int i = 2; i < n; ++i) { // Error: n was suppose to be nInt
            if (nInt % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}