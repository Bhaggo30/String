public class StringDemo2 {
    public static void main(String[] args) {

        String s = "welcome to bridgelabz solutions ";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.startsWith("welcome"));
        System.out.println(s.endsWith("solutions"));
        System.out.println(s.charAt(6));
        System.out.println(s.indexOf('b'));
        System.out.println(s.contains("labz"));

        String a = "java";
        String b = "java";
        String c = "java";

        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(s.substring(8));
        System.out.println(s.substring(5,23));

        String s1 = new String("hey welcome to string session");
        System.out.println(s1+ " ");
        s1.concat(  "for june batch");
        System.out.println(s1);  // no modification after changes
        String s2 = new String("for june batch");
        s2 = s1.concat("for june batch");
        System.out.println(s2);

        // some inbuild method for stringbuffer
        StringBuffer sb = new StringBuffer("hey bhagyashree");
        System.out.println(sb+ " ");
        sb.append("chouksey");
        System.out.println(sb+ " ");
        System.out.println(sb.charAt(2));

        // some inbuild method of stringbuilder

        StringBuilder sbb = new StringBuilder("good");
        System.out.println(sbb);
        sbb = sbb.append("morning");
        System.out.println(sbb);





    }
}
