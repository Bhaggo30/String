import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two Strings to check the strings are anagram or not ");

        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();

        if (str1.length() == str2.length()){
            char[] array_str1 = str1.toCharArray();
            char[] array_str2 = str2.toCharArray();

            Arrays.sort(array_str1);
            Arrays.sort(array_str2);
            boolean result = Arrays.equals(array_str1,array_str2);
            if (result){
                System.out.println(str1+ " "+str2+ " strings are anagram");
            }
            else{
                System.out.println(str1+ " "+str2+ " strings are not anagram");
            }
        }

    }
}
