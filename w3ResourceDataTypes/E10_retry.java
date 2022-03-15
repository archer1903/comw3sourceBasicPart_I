package w3ResourceDataTypes;

import java.util.Scanner;

public class E10_retry {
    public static void main(String[] args) {

//        10. Write a Java program to break an integer into a sequence of individual digits.
//
//        Test Data
//        Input six non-negative digits: 123456
//        Expected Output :
//        1 2 3 4 5 6


        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz");
        String sayi=scanner.next();

       int dizi[] = new int[sayi.length()];

       for(int i=0;i<sayi.length();i++){
           System.out.print((dizi[i]=sayi.charAt(i)-'0')+" ");

       }



    }
}
