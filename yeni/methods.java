package yeni;

public class methods {

    public static int carp(int a, int b){

        return (a*b);

    }
    public static void yazdir(String mesaj){

         System.out.println(mesaj);

    }

    public static void main(String[] args) {

        yazdir("carpim sonucu: "+ carp(3,10) );


    }



}
