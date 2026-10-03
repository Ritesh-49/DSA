package String;

import java.util.Scanner;

public class reverseStringWordbyWord {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.nextLine());

        int n = sb.length();
        int i= 0 , j =0;

        while(j<n){
            if (sb.charAt(j) != ' ') j++;

            else {
                Reverses(sb , i , j-1);
                i = j+1;
                j = i;
            }
        }
        Reverses(sb , i , j-1);// if the j is reach to the end of the string, and ther it will not get any space for that this line is written here


        System.out.println(sb);


    }

    public static void Reverses(StringBuilder sb , int i , int j){
        while (i<=j){
            char ch = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;
        }


    }
}
