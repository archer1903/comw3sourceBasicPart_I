package w3resourceBasicsPart_I;

import java.util.Scanner;

public class E32_CompareNumbers {
    public static void main(String[] args) {

//        Write a Java program to compare two numbers.
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//
//        25 != 39
//        25 < 39
//        25 <= 39


        Scanner scan = new Scanner(System.in);
        System.out.println("Input first integer:");
        int num1 = scan.nextInt();
        System.out.println("Input second integer:");
        int num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " = " + num2);
        }else{
            System.out.println(num1 + " != " + num2);
        }

        if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else if(num1>num2){
            System.out.println(num1 + " > " + num2);
        }else{
            System.out.println(num1 + " = " + num2);
        }

        if (num1 <= num2) {
            System.out.println(num1 + " <= " + num2);
        }else{
            System.out.println(num1 + " > " + num2);
        }



    }
}
