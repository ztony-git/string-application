package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {

        String item = "pasta";
        double price = 3.99;
        int quantity = 4;
        System.out.println("I bought " + quantity + " " + item + "s for " + price
                + "$ each, totalling " + (price * quantity) + "$");
    }


}
