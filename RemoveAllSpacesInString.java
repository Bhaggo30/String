import java.util.Scanner;

public class RemoveAllSpacesInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        char[] strArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] != ' ' && strArray[i] != '\t') {
                sb.append(strArray[i]);
            }
        }

        String withoutSpace = sb.toString();
        System.out.println("String without spaces: " + withoutSpace);
    }
}
