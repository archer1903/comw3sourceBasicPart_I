package w3ResoursceString;

public class E03 {
    public static void main(String[] args) {

      //  Write a Java program to get the character
        //  (Unicode code point) before the specified index within the String.

        String str= "w3resource.com";
        int num=5;


        System.out.println( str.codePointAt(num-1));;
        System.out.println( str.codePointBefore(num));;

//4. Write a Java program to count a number of
// Unicode code points in the specified text range of a String.

        String str1="This is Exercise 1";
        String str2="This is Exercise 2";

//compareTo kullanılmalı







    }
}
