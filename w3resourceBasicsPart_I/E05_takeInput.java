package w3resourceBasicsPart_I;

import java.util.Scanner;

public class E05_takeInput {
    public static void main(String[] args) {

//        Write a Java program that takes two numbers as input and display the product of two numbers
//        Test Data:
//        Input first number: 25
//        Input second number: 5
//        Expected Output :
//        25 x 5 = 125


        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number:");
        int num1=scan.nextInt();
        System.out.println("Input second number:");
        int num2=scan.nextInt();
        System.out.println(num1+" x "+ num2 + " = "+ (num1*num2));





    }
}
