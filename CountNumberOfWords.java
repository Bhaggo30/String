import java.util.Scanner;

public class CountNumberOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string to count how many words present in a string");
        String str = scanner.nextLine();

        int count =1;
        char [] str_Array = str.toCharArray();
        for (int i =0; i<str_Array.length-1; i++){
            if ((str_Array[i] == ' ') && str_Array[i+1] != ' '){
                count++;

            }
        }
        System.out.println("number of words present "+count);
    }
}
