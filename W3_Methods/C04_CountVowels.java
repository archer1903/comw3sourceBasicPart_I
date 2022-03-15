package W3_Methods;

public class C04_CountVowels {

    public static void main(String[] args) {
        //4. Write a Java method to count all vowels in a string.
        //Test Data:
        //Input the string: w3resource
        //Expected Output:
        //
        //Number of  Vowels in the string: 4

        String input = "w3resource";
        System.out.println(countVowels(input));

    }

    private static int countVowels(String input) {
        int number=0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' | ch == 'e' | ch == 'ı' | ch == 'i' | ch == 'o' | ch == 'ö' | ch == 'u' | ch == 'ü') {
               number ++;
            }

        }
        return number;
    }

}