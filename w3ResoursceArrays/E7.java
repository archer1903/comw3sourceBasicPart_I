package w3ResoursceArrays;

import java.util.ArrayList;

public class E7 {
    public static void main(String[] args) {
        /*
        Write a Java program to remove a specific element from an array.*/

        ArrayList<String> list=new ArrayList<>();

        list.add("Ali");
        list.add("Veli");
        list.add("Deli");

        System.out.println(list);
        list.remove("Deli");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }

}
