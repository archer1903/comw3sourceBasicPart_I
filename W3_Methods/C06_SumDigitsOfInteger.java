package W3_Methods;

public class C06_SumDigitsOfInteger {
    public static void main(String[] args) {
        //6. Write a Java method to compute the sum of the digits in an integer.
        //Test Data:
        //Input an integer: 25
        //Expected Output:
        //
        //The sum is 7


        int input=25;

        System.out.println(sumOfInteger(input));

    }

    public static int sumOfInteger(int input){
        String yeni=String.valueOf(input);;
        int toplam=0;


        for(int i=0; i<yeni.length(); i++){
            int veri=Integer.parseInt(yeni.substring(i,i+1));
            toplam+=veri;
        }
        return toplam;
    }



}
