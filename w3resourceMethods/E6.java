package W3Soursces_Methods;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        //Write a Java program to find the index of an array element.

        Scanner scanner = new Scanner(System.in);
        System.out.println("{1, 2, 33, 44, 55, 66, 88, 3, 55, 77, 8, 99} Arraydan bir sayi giriniz");
        int number = scanner.nextInt();

        int[] array = {1, 2, 33, 44, 55, 66, 88, 3, 55, 77, 8, 99};
        int i = -1;

        for (int ara : array) {
            i++;
            if (number == ara) {

                System.out.println(i);

            }return;
        }

    }
}

