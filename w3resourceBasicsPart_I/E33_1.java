package w3resourceBasicsPart_I;

import java.util.Scanner;

public class E33_1 {
    public static void main(String[] args) {
//        Write a Java program and compute the sum of the digits of an integer. Go to the editor
//        Input Data:
//        Input an integer: 25
//        Expected Output
//
//        The sum of the digits is: 7


        Scanner scan = new Scanner(System.in);

        System.out.println("Input an integer :");
        int input = scan.nextInt();

        System.out.println("Sum of the value of the numbers: " + sumDigits(input));

    }


    public static int sumDigits(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }


}
