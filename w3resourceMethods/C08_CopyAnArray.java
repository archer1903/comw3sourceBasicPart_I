package com.w3resourceMethods;

import java.util.Arrays;

public class C08_CopyAnArray {
    public static void main(String[] args) {

        //Write a Java program to copy an array by iterating the array.

        int[] myArray= {1,2,3,4,5,6,7,8,9,10};

        int[] newArray=new int[10];

        for (int i = 0; i < myArray.length; i++) {

            newArray[i]=myArray[i];

        }

        System.out.println("Source Array : "+Arrays.toString(myArray));
        System.out.println("Source Array : "+Arrays.toString(newArray));



    }

}

