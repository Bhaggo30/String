public class IsVowelOrConsonats {
    public static void main(String[] args) {
        String str = "Example String With Vowels And Consonats";
        int vowelCount =0;
        int ConsonantCount =0;
        String vowels ="AEIOUaeiou";

        for (char c : str.toCharArray()){
            if (Character.isLetter(c)){
                if (vowels.indexOf(c)!=-1){
                    vowelCount++;
                }
                else {
                    ConsonantCount++;
                }
            }
        }
        System.out.println("number of vowels "+vowels);
        System.out.println("number of consonants "+ConsonantCount);
    }
}
