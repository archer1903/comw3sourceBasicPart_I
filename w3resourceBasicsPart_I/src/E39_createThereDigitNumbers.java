package w3resourceBasicsPart_I.src;

public class E39_createThereDigitNumbers {
    public static void main(String[] args) {

        //39. Write a Java program to create and display unique
        // three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
        //Expected Output

        //123
        //124
        //...
        //
        //431
        //432
        //Total number of the three-digit-number is 24

        String[] digits = {"1", "2", "3", "4"};
        String number = "";
        int counter = 0;


        for (String bir : digits) {
            for (String iki : digits) {
                for (String uc : digits) {

                    if (bir!=iki&&iki!=uc&&bir!=uc){
                        System.out.println(bir + iki + uc+" ");
                        counter++;
                    }


                }
            }
        }

        System.out.println(counter);
    }
}
