import java.util.Scanner;

public class SwapTwoString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String s1 = sc.nextLine();
        System.out.println("enter second string");
        String s2 = sc.nextLine();

        System.out.println("before swap string "+s1+" "+s2 );
        s1 = s1+s2;
        s2 = s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("after swapping "+s1+ " "+s2);


    }
}
