package W3_Methods;

import java.util.Scanner;

public class C03_MiddleCharacter {
    public static void main(String[] args) {

        //3. Write a Java method to display the middle character of a string. Go to the editor
        //Note: a) If the length of the string is odd there will be two middle characters.
        //b) If the length of the string is even there will be one middle character.
        //Test Data:
        //Input a string: 350
        //Expected Output: The middle character in the string: 5

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir veri giriniz: ");
        String veri = scanner.next();

        System.out.println(middleCharacter(veri));



    }

    private static String middleCharacter(String veri) {

        if(veri.length()%2!=0) {
            return "The middle character in the string: "+veri.charAt(veri.length()/2);
        }else return "The middle character in the string: "+veri.charAt(veri.length()/2-1)+veri.charAt(veri.length()/2);

    }
}
