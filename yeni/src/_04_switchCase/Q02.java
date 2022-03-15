package yeni.src._04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız


        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");

        String sayi = scan.next();

        int[] array = new int[sayi.length()];




        for (int i = 0; i < sayi.length(); i++) {

            if(i==0){
                switch (sayi.charAt(0)) {
                    case '1':
                        System.out.println("yüz");
                        break;
                    case '2':
                        System.out.println("iki yüz");
                        break;
            }

            }else if(i==1){
                switch (sayi.charAt(1)) {
                    case '1':
                        System.out.println("on");
                        break;
                    case '2':
                        System.out.println("yirmi");
                        break;
                }
            }
                else    {
                switch (sayi.charAt(2)) {
                    case '1':
                        System.out.println("bir");
                        break;
                    case '2':
                        System.out.println("iki");
                        break;

                }
            }



                }

            }
        }
