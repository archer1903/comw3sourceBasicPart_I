package W3ResourcesDataTypes;

import java.util.Scanner;

public class E4_MinutesIntoYearsAndDays {
    public static void main(String[] args) {

//        4. Write a Java program to convert minutes into a number of years and days. Go to the editor
//
//        Test Data
//        Input the number of minutes: 3456789
//        Expected Output :
//        3456789 minutes is approximately 6 years and 210 days

        Scanner scan = new Scanner(System.in);
        System.out.println("Please a number in minutes: ");
        long input=scan.nextLong();
        long girilensayi=input;
        // a day is 3600 minutes
        // a year is 365 days, a year is 365*3600 minutes
        int year=0, day=0;

        while(input>=365*3600) {
            input-=(365*3600);
            year++;
        }
        while (input>=3600){
                   input-=3600;
                   day++;
        }
        System.out.println(girilensayi+ " minutes is approximately "+ year+ " years and " + day + " days");
    }
}
