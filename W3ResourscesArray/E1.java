package W3ResourscesArray;

import java.util.Arrays;

public class E1 {
    public static void main(String[] args) {
//      1. Write a Java program to sort a numeric array
//      and a string array.

        int[] number={1,2,3,6,2};
        String[] str={"Ali","Veli","Konya","Ahmet"};

        int uzunluk1=number.length;
        int uzunluk2=str.length;

        Arrays.sort(str); // Alfabetik sıralamaya  "numeric order" sokmaktadır.
        Arrays.sort(number);

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(str));


        System.out.println(uzunluk1);
        System.out.println(uzunluk2);










    }
}
