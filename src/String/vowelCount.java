package String;

import java.util.Scanner;

public class vowelCount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
//        String str = sc.nextLine();  using this we can enter the string after space


        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (isVowel(ch) == true) count++;

        }

        System.out.println(count);
        System.out.println(str);
    }

    public static boolean isVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'
                || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;
        else {
            return false;
        }
    }
}
