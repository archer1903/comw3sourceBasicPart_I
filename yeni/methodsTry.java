package yeni;

public class methodsTry {


    public static void main(String[] args) {


        int dizi[] = new int[]{1, 2, 3};

        islemyap(dizi);

        yazdir(dizi);

    }

    static void islemyap(int dizi[]) {

        for (int i = 0; i < 3; i++){
            dizi[i] = i * i;
        }


    }


    static void yazdir(int dizi[]) {

        for (int i:dizi)
        System.out.println(i);


    }
}