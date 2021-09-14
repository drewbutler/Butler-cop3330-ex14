/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;
import java.util.Objects;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double orderAmount= myObj.nextInt();

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("What is the state?");
        String stateName = myObj2.nextLine();

        double tax = 0.055;

        if (Objects.equals(stateName, "WI")) {
            System.out.printf("The subtotal is $%.2f\n", orderAmount);
            System.out.printf("The tax is $0.55.\n");

            double total = (orderAmount * tax) + orderAmount;

            System.out.printf("The total is $%.2f", total);
        }else {
            System.out.printf("The total is $%.2f", orderAmount);
        }

        myObj.close();
    }
}