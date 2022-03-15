package w3ResoursceString;

public class E06_compareTo {
    public static void main(String[] args) {

   //     6. Write a Java program to compare two strings
   //     lexicographically, ignoring case differences.


    String str1="This is exercise 1";
    String str2="This is Exercise 1";

    int result=str1.compareToIgnoreCase(str2);


    if(result==0){
        System.out.println("\""+str1+"\""+" is equal to "+"\""+str2+"\"");
    }else if(result>0){
        System.out.println("st1 is more");
    }else{
        System.out.println("st1 is less");

    }




    }
}
