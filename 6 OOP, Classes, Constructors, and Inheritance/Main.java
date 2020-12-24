package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        Account bobsAccount = new Account("12345", 0.00, "Bob Brown",
                "myemail@bob.com", "(087) 123-4567");
        System.out.println("Account constructor with parameters called");
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getCustomerPhoneNumber());
        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(50.00);
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
    }
}
