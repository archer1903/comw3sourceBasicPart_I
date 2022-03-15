package w3ResoursceArrays;

public class E3 {
    public static void main(String[] args) {
//        Write a Java program to print the following grid. Go to the editor
//
//        Expected Output :
//
//        - - - - - - - - - -
//                - - - - - - - - - -
//                        - - - - - - - - - -
//                                - - - - - - - - - -
//                                        - - - - - - - - - -
//                                                - - - - - - - - - -
//                                                        - - - - - - - - - -
//                                                                - - - - - - - - - -
//                                                                        - - - - - - - - - -
//                                                                                - - - - - - - - - -


            int[] myArray={1,2,3,4};
            String[] myArray2={"a","b","c","d"};

        for (int i:myArray)
        {

            for (String j:myArray2) {
                System.out.print(j);
            }
            System.out.print(i);
        }








    }
}
