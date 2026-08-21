package Array;

import java.util.Scanner;

public class arrayToArgument {
    // when we send array as argument then array alway pass by reference , means change in
    // value can also change the original array
    public static void change(int[] arr ){  // arr , or x
        arr[0] = 10;
    }
    public static void main(String[] args) {
        int[] arr = {2 ,  3, 4, 7 };
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);


    }
}
