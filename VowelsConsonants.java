import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();

        int vowelCount =0;
        for (int index =0; index<str.length();index++){
            char ch = str.charAt(index);
            if (ch=='a'||ch=='e' ||ch=='i' ||ch=='o'||ch=='u' ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                vowelCount++;
            }
            System.out.println("number of vowels "+vowelCount);


        }
    }


