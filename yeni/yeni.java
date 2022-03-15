package yeni;

public class yeni {

    public static void main(String[] args) {

        // sayi asal mı

        int number = 4;

        if(number==1) {
            System.out.println(number + " sayisi asal değil");
            return;
        }


        for(int i=2;i<number;i++ ){

           if(number%i==0) {
               System.out.println(number + " sayisi asal değil");
               return;
           }

        }
        System.out.println(number + " sayisi asaldır.");




    }


}

