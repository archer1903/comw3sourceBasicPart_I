package w3resourceBasicsPart_I;

import java.util.Scanner;

public class E01_writeName {
    public static void main(String[] args) {

        //Write a Java program to print 'Hello' on screen and then print your name on a separate line.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please write your name : ");
        String fname = scan.nextLine();

        System.out.println("Please write your lastname : ");
        String lname = scan.nextLine();

        System.out.println("Hello\n"+fname+" "+lname);


    }

}

