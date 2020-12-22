package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        char charTest = 'Z';
        switch(charTest) {
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value is C, D or E");
                break;

            default:
                System.out.println("Invalid Value");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
