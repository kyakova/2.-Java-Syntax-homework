package org.softuni;
import java.util.Scanner;

public class DecimalToBase7 {

    public static void main(String[] args) {

       System.out.println("Enter a number: ") ;
        Scanner input = new Scanner(System.in);
        Integer number = input.nextInt();
        System.out.print(Integer.toString(number, 7));


    }
}
