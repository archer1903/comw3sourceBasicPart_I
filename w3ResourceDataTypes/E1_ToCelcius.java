package w3ResourceDataTypes;

import java.util.Scanner;

public class E1_ToCelcius {
    public static void main(String[] args) {
//        1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. Go to the editor
//        Test Data
//        Input a degree in Fahrenheit: 212
//        Expected Output:
//        212.0 degree Fahrenheit is equal to 100.0 in Celsius


        Scanner scan=new Scanner(System.in);
        System.out.println("Sıcaklık giriniz(Celcius): ");
        double sicaklik=scan.nextInt();

        System.out.println(sicaklik*9/5+32+" Fehrenheit eder.");








    }
}
