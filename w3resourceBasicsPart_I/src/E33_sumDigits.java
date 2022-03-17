package w3resourceBasicsPart_I.src;

import java.util.Scanner;

public class E33_sumDigits {
    public static void main(String[] args) {
//        Write a Java program and compute the sum of the digits of an integer. Go to the editor
//        Input Data:
//        Input an integer: 25
//        Expected Output
//
//        The sum of the digits is: 7


        Scanner scan = new Scanner(System.in);

        System.out.println("Input an integer (max:999):");
        int input = scan.nextInt();
        int sum = 0;

        if (input < 10) {
            sum = input % 10;
        } else if (input > 9 && input < 100) {
            sum = input % 10;
            sum += input / 10;
        } else if (input > 99) {
            sum = input % 10;
            int iki = input / 10;
            sum += iki % 10;
            sum += iki / 10;
        }

        System.out.println("Sum of the value of the numbers: " + sum);

    }
}