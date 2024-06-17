import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two string to check weather a string is anagram or not ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1.length() == s2.length()) {
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            boolean result = Arrays.equals(a1, a2);
            if (result) {
                System.out.println("strings are anagram");
            } else {
                System.out.println("strings are not anagram");
            }
        }
          else
                System.out.println("strings are not anagram ");
            }
        }

