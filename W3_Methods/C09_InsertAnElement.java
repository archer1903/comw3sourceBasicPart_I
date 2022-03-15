package W3_Methods;

import java.util.Arrays;

public class C09_InsertAnElement {
    public static void main(String[] args) {

        //Write a Java program to insert an element (specific position) into an array.

        int[] myArray= {1,2,3,4,5,6,7,8,9,10};

        int Index_position = 4;
        int newValue    = 0;


        System.out.println(Arrays.toString(myArray));

        for (int i = myArray.length-1; i > Index_position; i--) {
            myArray[i] = myArray[i-1];
        }
        System.out.println(Arrays.toString(myArray));

        myArray[Index_position] =  newValue;

        System.out.println(Arrays.toString(myArray));


    }
}
