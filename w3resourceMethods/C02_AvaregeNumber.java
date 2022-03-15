package com.w3resourceMethods;

public class C02_AvaregeNumber {
    public static void main(String[] args) {
        //2. Write a Java method to compute the average of three numbers.

        double a=10,b=15,c=24;

        System.out.println(average(a,b,c));


    }

    private static double average(double a,double b,double c) {

        return (a+b+c)/3;
    }


}
