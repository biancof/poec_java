package com.formation.start;

public class PrimeNumbers {

    // it prints on the screen all prime numbers among
    // the values of a given table

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 200, 5, 52, 67, 99, 9, 0, 89, -2, -1, 0, 11111111 };
        System.out.print("List of prime numbers: ");
        int howMany = getPrimeNumbers(nums).length;
        for (int i = 0; i < howMany; ++i) {
            System.out.print(getPrimeNumbers(nums)[i] + " ");
        }
        System.out.println();
    }

    // method # 1: it stock all prime numbers among values of a
    // table in a second table

    public static int[] getPrimeNumbers(int[] tab) {
        int howMany = 0;
        for (int i = 0; i < tab.length; ++i) {
            if (isPrime(tab[i]) == false) {
                tab[i] = 0;
            } else {
                ++howMany;
            }
        }
        int[] primeNums = new int[howMany];
        int j = 0;
        for (int i = 0; i < tab.length; ++i) {
            if (tab[i] != 0) {
                primeNums[j] = tab[i];
                ++j;
            }

        }
        return primeNums;
    }

    // method # 2: it verifies if an int n is prime or not

    public static boolean isPrime(int n) {
        boolean prime = true;
        if (n < 2) {
            prime = false;
        }
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

