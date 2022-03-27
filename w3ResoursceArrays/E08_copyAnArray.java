package w3ResoursceArrays;

import java.util.Arrays;

public class E08_copyAnArray {
    public static void main(String[] args) {
        /*
        Write a Java program to copy an array by iterating the array.*/

        int[] array = {1,3,6,9};
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length ; i++) {

            array2[i]=array[i];
        }

        System.out.println(Arrays.toString(array2));

    }
}
