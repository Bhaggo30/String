import java.util.Scanner;

public class PreserveReverseString {

    public static void reverse(String str) {
        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        int j = inputArray.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != ' ') {
                while (j >= 0 && result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }

        System.out.println(String.valueOf(result));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine();

        reverse(str);
    }
}
