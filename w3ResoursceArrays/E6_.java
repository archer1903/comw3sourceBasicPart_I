package w3ResoursceArrays;

public class E6_ {
//Write a Java program to find the index of an array element.
    static int[] a;
    public static int findIndex(int[] array, int t) {
        if (array == null) return -1;  // BU SATIR NEDEN VAR ?
        int len = array.length;

        for (int i = 0; i < len; i++) {
            if (t == array[i]) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Index position of 25 is: " + findIndex(my_array, 1));
        System.out.println("Index position of 77 is: " + findIndex(a, 77));
    }
}


