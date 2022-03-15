package W3ResourscesString;

public class E02 {
    public static void main(String[] args) {
//2. Write a Java program to get the character
// (Unicode code point) at the given index within the String.

        String str = "w3resource.com";
        System.out.println("Original String : " + str);

        // codepoint at index 1
        int val1 = str.codePointAt(1);

        System.out.println(val1);



    }
}
