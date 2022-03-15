package w3ResoursceArrays;

public class E5_try {
    public static void main(String[] args) {

//Write a Java program to test if an array contains a specific value.

        int myArray[] = {1, 2, 3, 46, 68, 33};

        System.out.println(contains(myArray, 33));

    }

    public static boolean contains(int[] arr, int ara) {

        for (int n : arr) {
            if (n == ara) {
                return true;
            }

        }
        return false;
    }

}

