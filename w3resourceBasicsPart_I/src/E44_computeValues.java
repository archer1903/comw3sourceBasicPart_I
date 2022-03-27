package w3resourceBasicsPart_I.src;


public class E44_computeValues {
    public static void main(String[] args) {

        /*    Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Go to the editor
    Sample Output:

    Input number: 5
            5 + 55  + 555*/

        int input = 10;
        String nn=String.valueOf(input)+String.valueOf(input);
        String nnn=String.valueOf(input)+String.valueOf(input)+String.valueOf(input);
        int second=Integer.parseInt(nn);
        int third=Integer.parseInt(nnn);
        System.out.println(input+"+"+nn+"+"+nnn);
        System.out.print(input+second+third);


    }
}
