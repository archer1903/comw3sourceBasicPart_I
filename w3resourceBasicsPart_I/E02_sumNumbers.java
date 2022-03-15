package w3resourceBasicsPart_I;


import java.util.Scanner;

public class E02_sumNumbers {
    public static void main(String[] args) {
        // Write a Java program to print the sum of two numbers.

        int num1=74;
        int num2=36;

        System.out.println(num1+num2);


        Scanner input = new Scanner(System.in);

        System.out.println("Please input the first number: ");
        int input1=input.nextInt();
        System.out.println("Please input the second number: ");
        int input2=input.nextInt();

        int sum= input1+input2;
        System.out.println("Sum :"+" "+sum);

    }












}
