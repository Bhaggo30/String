import java.util.Scanner;

public class SumOfDigitInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.next();
        int sumOfDigit =0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>='0' && ch<='9'){
                sumOfDigit +=ch-48;

            }
        }
        System.out.println("number of digit present in a string "+sumOfDigit);

    }
}
