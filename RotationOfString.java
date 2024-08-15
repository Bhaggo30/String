import java.util.Scanner;

public class RotationOfString {
    public static boolean rotationString(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String str3 = str1 + str2;
        if (str3.contains(str2)) {
            return true;
        } else
            return false;

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two Strings to check first string is rotation of second strings");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        boolean result = rotationString(str1, str2);
        System.out.println(result + " first string is the rotation of " + str1 + " second " + str2);

    }
}
