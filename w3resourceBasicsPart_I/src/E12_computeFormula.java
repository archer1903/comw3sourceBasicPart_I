package w3resourceBasicsPart_I.src;

import java.util.Scanner;

public class E12_computeFormula {
    public static void main(String[] args) {
//        12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.


        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number:");
        int num1=scan.nextInt();
        System.out.println("Input second number:");
        int num2=scan.nextInt();
        System.out.println("Input third number:");
        int num3=scan.nextInt();

        System.out.println("Avarege :" + (num1+num2+num3)/3);










    }
}
