import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String original_string = sc.nextLine();
        String reverse_string = "";
        char ch;

        for (int i = original_string.length() - 1; i >= 0; i--) {
            ch = original_string.charAt(i);
            reverse_string = reverse_string + ch;
        }

        System.out.println("Reverse of the string is: " + reverse_string);
        if (original_string.equals(reverse_string)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
}
