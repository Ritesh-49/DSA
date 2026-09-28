package String;

public class equalsAndequal {
    static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b  = new String(s);
        String c = "abc";
        c = c + "xyz";
        System.out.println(s==a);
        System.out.println(s.equals(b));

    }
}
