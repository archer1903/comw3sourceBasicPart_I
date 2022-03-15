package yeni;

import java.util.Scanner;

public class isMukemmel {
    public static void main(String[] args) {

        // kendini bölen sayıların toplamı kendine eşit olan sayıdır
        // 6 --> 1,2,3
        // 28 --> 1,2,4,7,14


        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int number=scanner.nextInt();

        int toplam=0;

        for(int i=1;i<number;i++){

           if(number%i==0){
               toplam+=i;
           }
        }

        if (number==toplam) {
            System.out.println("Sayi mükemmeldir");
        }else{
            System.out.println("Sayı mükemmel değildir");
        }



    }

}
