import java.util.Scanner;

public class Panagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String inputString = scanner.nextLine();
        boolean isPanagram = checkPanagram(inputString);

        if (isPanagram) {
            System.out.println("The given string is a panagram.");
        } else {
            System.out.println("The given string is not a panagram.");
        }
    }

    static boolean checkPanagram(String str) {
        if (str.length() < 26) {
            return false;
        }

        int[] letterCount = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                letterCount[ch - 65]++;
            } else if (ch >= 'a' && ch <= 'z') {
                letterCount[ch - 97]++;
            }
        }
        for (int count : letterCount) {
            if (count == 0) {
                return false;
            }
        }

        return true;
    }
}
