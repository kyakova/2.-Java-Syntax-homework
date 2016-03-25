package org.softuni;
import java.util.Scanner;

public class CalculateExpression {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a  = input.nextDouble();
        double b  = input.nextDouble();
        double c  = input.nextDouble();

        double form1 = ((a*a) + (b*b)) / ((a*a) - (b*b));
        double form1Exp = (a+b+c) / (Math.sqrt(c));
        double final1 = Math.pow(form1, form1Exp);

        double form2 = (a*a) + (b*b) - (c*c*c);
        double form2Exp = (a-b);
        double final2 = Math.pow(form2, form2Exp);

        double difference = Math.abs(((a+b+c)/3) - ((final1 + final2)/2));

        System.out.printf("Formulae 1 result: %.2f; Formulae 2 result: %.2f; Difference: %.2f", final1, final2, difference);

    }
}
