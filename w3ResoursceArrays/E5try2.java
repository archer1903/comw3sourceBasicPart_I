package w3ResoursceArrays;

public class E5try2 {


    public static void main(String[] args) {

//Write a Java program to test if an array contains a specific value.

        int [] dizi={10,30,50,80,44,66};

        System.out.println(ara(dizi,31));

    }


    public static boolean ara(int[] dizi2, int deger){

        for(int i=0;i<dizi2.length;i++){

            int eleman=dizi2[i];

            if(eleman==deger){
                return true;
            }
        }
        return false;

    }


}
