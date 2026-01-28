package chap3.chaines;

public class MainString {
    static void main() {
        String s1 = "Bonjour";
        String s2 = "Bonjour";
        String s3 = new String("Bonjour");

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s2 : " + (s1.equals(s2)));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s1 == s3 : " + (s1.equals(s3)));

        StringBuilder sb = new StringBuilder("Bonjour");
        sb.append("Bonjour");
        System.out.println(sb.toString());

        StringBuffer sb2 = new StringBuffer("Bonjour");
        sb2.append("Bonjour");
        System.out.println(sb2.toString());
    }
}
