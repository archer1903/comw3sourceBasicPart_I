package w3ResourceDataTypes;

import java.util.Scanner;

public class E10_IntegerArray {
    public static void main(String[] args) {

//        10. Write a Java program to break an integer into a sequence of individual digits. Go to the editor
//
//        Test Data
//        Input six non-negative digits: 123456
//        Expected Output :
//        1 2 3 4 5 6




        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");

        String number=scan.next();
        int[] sayiarray = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            System.out.print(( sayiarray[i] = number.charAt(i) - '0') + " ");

        }
        System.out.println("");
        System.out.println("Congratulations! Mission completed successfully");


    }
}
