package String;

import java.util.Scanner;

public class reverseString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.nextLine());

        int n = sb.length();
        int i = 0, j = n-1;
        System.out.println(sb);

        while (i <= j){
            char t = sb.charAt(i);
            char ch  = sb.charAt(j);
            char ch1  = t;

            sb.setCharAt(i, ch);
            sb.setCharAt(j, ch1);

            i++;
            j--;
        }
        System.out.println(sb);
    }
}
