import java.util.Scanner;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        System.out.println("enter the integer value");
        String Str = "5";

        //1 way
        int result = Integer.parseInt(Str);
        System.out.println(result);

        // 2 way
        Integer result1 = Integer.valueOf(Str);
        System.out.println(result1);

        int x =5;
        String res = Integer.toString(x);
        System.out.println(res);

        String str2 = String.valueOf(x);
        System.out.println(str2);
    }
}
