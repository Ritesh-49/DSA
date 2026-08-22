package Array;

import java.util.Arrays;

public class arrayMethods {

    public static void main(String[] args) {
        int[] arr = {10,5,6,6,7,8,8,9};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int x : arr){  // forEach loop
            System.out.print(x);
        }

        Arrays.sort(arr);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
