package w3resourceBasicsPart_I.src;

import java.util.Scanner;

public class E03_divideNumbers {

    public static void main(String[] args) {

        //Write a Java program to divide two numbers and print on the screen.
        int num1=50;
        int num2=3;



        Scanner scan =new Scanner(System.in);

        System.out.println("Write the first number:\n");
        int fnum=scan.nextInt();
        System.out.println("Write the second number:\n");
        int lnum=scan.nextInt();

        int devide=fnum/lnum;

        System.out.println("Result: "+devide);










    }
}
