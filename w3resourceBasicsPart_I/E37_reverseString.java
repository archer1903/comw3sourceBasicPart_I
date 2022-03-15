package w3resourceBasicsPart_I;

import java.util.Scanner;

public class E37_reverseString {
    public static void main(String[] args) {
//        Write a Java program to reverse a string. Go to the editor
//        Input Data:
//        Input a string: The quick brown fox
//        Expected Output
//
//        Reverse string: xof nworb kciuq ehT


        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen metin giriniz: ");
        char[] letters =scan.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i=letters.length-1; i>=0;i--){
            System.out.print(letters[i]);
        }










    }
}
