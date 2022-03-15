package W3ResourcesBasicsPart_I;

import java.util.Scanner;

public class E15_input {
    public static void main(String[] args) {


        int x,y,temp;


        Scanner scan =new Scanner(System.in);

        System.out.println("Input a number:");
        x=scan.nextInt();
        System.out.println("Input a number:");
        y=scan.nextInt();

        temp=x;
        x=y;
        y=temp;



        System.out.println("Swapped numbers:"+x+" and "+y);





        System.out.println("\nJava Version: "+System.getProperty("java.version"));





    }
}
