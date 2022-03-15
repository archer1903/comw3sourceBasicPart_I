package w3resourceBasicsPart_I;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
//        7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
//        Test Data:
//        Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//         ...


        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number:");
        int num1=scan.nextInt();

        for (int i=1;i<11;i++){

            System.out.println(num1+" x "+i+" = "+(num1*i));

        }







    }
}
