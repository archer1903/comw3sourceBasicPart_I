package w3resourceBasicsPart_I.src;

import java.util.Scanner;

public class E41_asciiValue {
    public static void main(String[] args) {
//        Write a Java program to print the ascii value of a given character.
//        Expected Output
//        The ASCII value of Z is :90

        Scanner scan=new Scanner(System.in);
        System.out.println("Write a char : ");
        String input = scan.next();
        char ch=input.charAt(0);

        System.out.println("The ASCII value of "+ch+" is : "+(int)ch);


    }
}
