package yeni;

import java.util.Scanner;

public class methodsTry2 {
    public static void main(String[] args) {

        String dizi[] = new String[3];
        islemyap(dizi);
        yaz(dizi);
    }

    public static void islemyap(String dizi[]) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + ". İsmi giriniz.");
            dizi[i] = scanner.next();
        }
    }
        private static void yaz(String[] dizi) {
            System.out.println("İsimler : ");
            for (String i : dizi
            )
                System.out.println(i);
        }

}

