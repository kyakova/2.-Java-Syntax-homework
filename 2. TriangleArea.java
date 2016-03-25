package org.softuni;
import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        double sideA = 0;
        double sideB = 0;
        double sideC = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the points of the three sides: ");
        double sideAX = input.nextDouble();
        double sideAY = input.nextDouble();
        double sideBX = input.nextDouble();
        double sideBY = input.nextDouble();
        double sideCX = input.nextDouble();
        double sideCY = input.nextDouble();

        sideA = Math.sqrt(Math.pow((sideBX - sideAX), 2) + Math.pow ((sideBY - sideAY), 2));
        sideB = Math.sqrt(Math.pow((sideCX - sideBX), 2) + Math.pow ((sideCY - sideBY), 2));
        sideC = Math.sqrt(Math.pow((sideAX - sideCX), 2) + Math.pow ((sideAY - sideCY), 2));

        double s = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(s * (s-sideA) * (s - sideB) * (s - sideC));

        System.out.println("area" + area);

    }
}
