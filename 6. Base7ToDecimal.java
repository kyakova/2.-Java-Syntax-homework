package org.softuni;
import java.util.Scanner;

public class Base7ToDecimal {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        String number = input.next();

        try {
            Integer decimal = Integer.valueOf(number, 7);
            System.out.println(decimal);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number entered.");

        }
    }
}
