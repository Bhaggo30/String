import java.util.Scanner;

public class CapitalizedEachWordString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();

        // Split the sentence into an array of strings
        String[] array = sentence.split(" ");

        // Loop through each word in the array
        for (int i = 0; i < array.length; i++) {
            // Get the first character of the word
            char firstChar = array[i].charAt(0);

            // Get the rest of the word excluding the first character
            String restOfWord = array[i].substring(1);

            // Convert the first character to uppercase and concatenate with the rest of the word
            System.out.print((char) (firstChar - 32) + restOfWord + " ");
        }
    }
}
