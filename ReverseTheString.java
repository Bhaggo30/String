public class ReverseTheString {

    public static void main(String[] args) {

        String str = "namma banglore";
        String reverseString = " ";
        char ch;
        for (int i =0; i<str.length(); i++){
            ch = str.charAt(i);
            reverseString = ch +reverseString;
        }
        System.out.println("reverse of the string is "+reverseString);
    }
}
