package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        // Integer.parseInt is an option for int.
        double number = Double.parseDouble(numberAsString);
        number += 2;
        numberAsString +=2;
        System.out.println(number);
        System.out.println(numberAsString);
    }
}
