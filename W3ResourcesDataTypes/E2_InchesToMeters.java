package W3ResourcesDataTypes;

import java.util.Scanner;

public class E2_InchesToMeters {
    public static void main(String[] args) {
//        2. Write a Java program that reads a number in inches, converts it to meters. Go to the editor
//        Note: One inch is 0.0254 meter.
//                Test Data
//        Input a value for inch: 1000
//        Expected Output :
//        1000.0 inch is 25.4 meters

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number in inches: ");
        int num=scan.nextInt();

        System.out.println(num*0.0254);




    }
}
