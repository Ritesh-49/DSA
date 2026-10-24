package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagramOfString {

    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return  false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;

    }

    static void main(String[] args) {
      boolean b =   isAnagram("anagram","anagram");
        System.out.println(b);
    }
}
