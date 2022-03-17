package w3resourceBasicsPart_I.src;

import java.util.Scanner;

public class E12_Average {
    public static void main(String[] args) {
        //12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

        int sum=0;
        int times=1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet sayının ortalamasını alacaksınız. ");
        int num=scan.nextInt();

        while(times<=num){

            System.out.println("Lütfen sayı giriniz"+"("+ times +") :");
            sum+=scan.nextInt();
            times++;
        }
        double ortalama = (sum/num);
        System.out.println("Girdiginiz sayilarin ortalaması: "+ortalama);








    }
}
