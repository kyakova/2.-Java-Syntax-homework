package org.softuni;
import java.util.Scanner;


public class RectangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("a= ");
        int a = input.nextInt();

        System.out.println("b= ");
        int b = input.nextInt();

        System.out.println("Area = " + a * b);


    }
}
