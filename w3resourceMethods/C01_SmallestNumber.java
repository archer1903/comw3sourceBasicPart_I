package com.w3resourceMethods;

import java.util.Scanner;
public class C01_SmallestNumber {
    public static void main(String[] args) {

//        1. Write a Java method to find the smallest number among three numbers. Go to the editor
//        Test Data:
//        Input the first number: 25
//        Input the Second number: 37
//        Input the third number: 29

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number:");
        double num1=scanner.nextDouble();
        System.out.println("Input the Second number:");
        double num2=scanner.nextDouble();
        System.out.println("Input the third number:");
        double num3=scanner.nextDouble();



        sonuc(num1,num2,num3);

    }

    public static void sonuc(double... sayilar){

        if (sayilar[0] < sayilar[1] & sayilar[0] < sayilar[2]) {
            System.out.println("Smallest number is: " +sayilar[0]);
        }else if (sayilar[1] < sayilar[0] & sayilar[1] < sayilar[2]){
            System.out.println("Smallest number is: " +sayilar[1]);
        }else if(sayilar[2] < sayilar[0] & sayilar[2] < sayilar[1]){
            System.out.println("Smallest number is: " +sayilar[2]);

        }else System.out.println("Numbers are equal.");


    }


}
