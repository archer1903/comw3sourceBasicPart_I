package w3resourceBasicsPart_I;

import java.util.Scanner;

public class E12_calculateAverage {
    public static void main(String[] args) {
        double num = 0;
        double x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the numbers you want to calculate the average: ");
        int n = sc.nextInt();
        while (x <= n) {
            System.out.println("Input number " + "("+ (int) x +")" + ":");
            num += sc.nextInt();
            x += 1;
        }
        double avgn = (num / n);

        System.out.println("Average:" + avgn);
    }
}
