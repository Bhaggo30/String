import java.util.Locale;
import java.util.Scanner;
public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String str1 = sc.nextLine();
        boolean rs = isPanagram(str1);
        if (rs) {
            System.out.println("given string is panagram ");
        } else {
            System.out.println("given string is not a pranagraam ");
        }
    }

    static  boolean isPanagram(String str) {
        if (str.length() < 26) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count[ch - 65]++;
            }

        }
        return true;
    }
}