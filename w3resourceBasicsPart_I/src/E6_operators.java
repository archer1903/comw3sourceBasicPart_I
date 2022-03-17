package w3resourceBasicsPart_I.src;

import java.util.Scanner;

public class E6_operators {
    public static void main(String[] args) {

//        Write a Java program to print the sum (addition),
//        multiply, subtract, divide and remainder of two numbers. Go to the editor
//        Test Data:
//        Input first number: 125
//        Input second number: 24

//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5

        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number:");
        int num1=scan.nextInt();
        System.out.println("Input second number:");
        int num2=scan.nextInt();
        System.out.println(num1+" + "+ num2 + " = "+ (num1+num2));
        System.out.println(num1+" - "+ num2 + " = "+ (num1-num2));
        System.out.println(num1+" x "+ num2 + " = "+ (num1*num2));
        System.out.println(num1+" / "+ num2 + " = "+ (num1/num2));
        System.out.println(num1+" mod "+ num2 + " = "+ (num1%num2));
    }
}
