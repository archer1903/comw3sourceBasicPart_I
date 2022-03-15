package W3_Methods;

public class C05_CountingWords {

    public static void main(String[] args) {
        //5. Write a Java method to count all words in a string. Go to the editor
        //Test Data:
        //Input the string: The quick brown fox jumps over the lazy dog.
        //Expected Output:
        //
        //Number of words in the string: 9

        String input="The quick brown fox jumps over the lazy dog.";


        System.out.println("There are "+(countWords(input)+1)+" words in the String.");
    }

    public static int countWords(String input){

        int words=0;
        for(int i=0; i<input.length();i++){
            if(input.charAt(i)==' '){
                words++;
            };

        }
        return words;

    }


}
