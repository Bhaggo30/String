public class SmallCapitalSpeacial {
    public static void main(String[] args) {
        String input = "Example1234! #String @WITH ^Various *$#Charactters";
        int lowwerCaseCount =0;
        int uperCaseCount =0;
        int digitCount =0;
        int speacialCharacterCount =0;
        for(char c : input.toCharArray()){
            if (Character.isLowerCase(c)){
                lowwerCaseCount++;
            } else if (Character.isUpperCase(c)) {
                uperCaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;

            }
            else {
                speacialCharacterCount++;
            }
        }
        System.out.println("number of lowercase letters "+lowwerCaseCount);
        System.out.println("number of upper case letters "+uperCaseCount);
        System.out.println("number of digits "+digitCount);
        System.out.println("number of speacial character "+speacialCharacterCount);
    }
}
