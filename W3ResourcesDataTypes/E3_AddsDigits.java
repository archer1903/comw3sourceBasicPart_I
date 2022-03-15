package W3ResourcesDataTypes;

import java.util.Scanner;

public class E3_AddsDigits {
    public static void main(String[] args) {
//        3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. Go to the editor
//        Test Data
//        Input an integer between 0 and 1000: 565
//        Expected Output :
//        The sum of all digits in 565 is 16

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number between 0 and 1000 please: ");
        int input=scan.nextInt();

        while( input<0 || input>1000){
            System.out.println("Please write a number between 0 and 1000");
            input=scan.nextInt();
        }
            System.out.println("The total of digits is: "+sumDigits(input));

    }

    public static int sumDigits(int x){
        int sum=0;
        while(x!=0){
            sum+=x%10;
            x/=10;
        }
        return sum;
    }

}
