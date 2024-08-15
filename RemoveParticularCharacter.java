public class RemoveParticularCharacter {

        public static void main(String[] args) {
            String originalString = "Hello World";
            char characterToRemove = 'o';


            String resultString = "";


            for (int i = 0; i < originalString.length(); i++) {

                char currentChar = originalString.charAt(i);


                if (currentChar != characterToRemove) {
                    resultString += currentChar;
                }
            }


            System.out.println("Original String: " + originalString);
            System.out.println("Modified String: " + resultString);
        }
    }


