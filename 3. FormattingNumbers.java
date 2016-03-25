package org.softuni;
import java.util.Scanner;
import java.lang.String;


public class FormattingNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three digits: ");
        int firstNumber = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        String hex = Integer.toHexString(firstNumber);
        String binary = Integer.toString(firstNumber, 2);

        System.out.printf("| %10d | %10d | %10.2d | %-10.3d |" + hex, binary, b, c);
    }
}
