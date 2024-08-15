import java.util.Scanner;

public class RemoveDuplicateCharcater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();

        char[] str_Array = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i =0; i<str_Array.length; i++){
            boolean repeated_character = false;
            for (int j =i+1; j<str_Array.length; j++){
                if (str_Array[i] == str_Array[j]){
                    repeated_character = true;
                    break;
                }
            }
            if (!repeated_character){
                sb.append(str_Array[i]);
            }
        }
        System.out.println(sb);
    }
}
