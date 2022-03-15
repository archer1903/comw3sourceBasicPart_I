package W3ResourcesDataTypes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E7_DistanceMeters {
    public static void main(String[] args) {

//        7. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters). Go to the editor
//
//        Test Data
//        Input distance in meters: 2500
//        Input hour: 5
//        Input minutes: 56
//        Input seconds: 23
//        Expected Output :
//        Your speed in meters/second is 0.11691531
//        Your speed in km/h is 0.42089513
//        Your speed in miles/h is 0.26158804


        Scanner scan = new Scanner(System.in);
        System.out.println("Please input in order, distance: ");
        float  distance=scan.nextFloat();
        System.out.println("Hours: ");
        float  hours=scan.nextFloat();
        System.out.println("Minutes: ");
        float  minutes=scan.nextFloat();
        System.out.println("Seconds: ");
        float  seconds=scan.nextFloat();

        System.out.println("Your speed in meters/second is "+distance/((hours*3600)+(minutes*60)+seconds));
        System.out.println("Your speed in km/h "+(distance/1000)/(hours+(minutes/60)+(seconds/3600)));
        System.out.println("Your speed in miles/h "+(distance/1609)/(hours+(minutes/60)+(seconds/3600)));






    scan.close();



    }
}
