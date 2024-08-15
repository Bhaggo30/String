import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String sentence = sc.nextLine();

        String [] words = sentence.split(" ");
        String reverseString = "";
        for (int i=0; i<words.length;i++){
            String word = words[i];
            String reverseWords = "";
            for (int j = word.length()-1; j>=0; j--){
                reverseWords = reverseWords+word.charAt(j);
            }
            reverseString = reverseString + reverseWords+ " ";

        }
        System.out.println(reverseString);
    }
}
