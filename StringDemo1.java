public class StringDemo1 {
    public static void main(String[] args) {

        String FirstName = "bhagyashree";
        String LastName = "chouksey";
        String name1 = "tom&jerry";
        String name2 = "tom&jerry";
        String number = "12345";
        int numb = 123;
        String FullName = FirstName + " " + LastName;
        System.out.println(FullName);
        System.out.println(FullName.length());
        for (int i = 0; i < FullName.length(); i++) {
            System.out.println(FullName.charAt(i));
        }
        if (name1.equals(name2)) {
            System.out.println("string of name1 and name2 are same ");
        }
        else{
                System.out.println("string of name1 and name2 are deffrent");
            }
            System.out.println(FullName.substring(12));
            int num = Integer.parseInt(number);
            System.out.println(num);
            String strr = Integer.toString(numb);
             System.out.println(strr.length());
        }
    }
