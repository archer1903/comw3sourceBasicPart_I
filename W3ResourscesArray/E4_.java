package W3ResourscesArray;

public class E4_ {
    public static void main(String[] args) {
//Write a Java program to calculate the average value of array elements.

    double Array[]={1,2,3,4,5,6,20};
    int topla=0;


     for(int i=0;i<Array.length;i++){
         topla+=Array[i];
        }
        System.out.println(topla/Array.length);
    }
}
