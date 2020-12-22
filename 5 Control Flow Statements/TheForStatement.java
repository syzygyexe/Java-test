package com.company;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 9 ; i++) {
            // %.2f Leave only 2 decimal points.
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("***************");

        for(int i = 8; i >= 2 ; i--) {
            // %.2f Leave only 2 decimal points.
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("***************");

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        // Square root for optimization purposes instead of (n/2)
        for (int i = 2; i <= (long) Math.sqrt(n) ; i++) {
            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
