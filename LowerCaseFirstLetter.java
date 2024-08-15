import java.util.Scanner;

public class LowerCaseFirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String actual_String = sc.nextLine();

        String changed_String ="";

        String [] words = actual_String.split(" ");
        for (int i =0; i<words.length;i++){
            String firstCharacter = words[i].substring(0,1).toLowerCase();
            String afterSecondCharacter = words[i].substring(1).toUpperCase();
            changed_String += firstCharacter+ afterSecondCharacter+ " ";

        }
        System.out.println(changed_String);

    }
}
