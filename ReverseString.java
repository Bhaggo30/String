import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        char[] ch = str.toCharArray();
        for (int i=0; i<ch.length/2;i++){
            char temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-i-1]=temp;
        }
        String str1 = new String(ch);
        System.out.println(str1);



    }
}
