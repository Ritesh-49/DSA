package Array;

import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int [] arr = {3, 5,6,7,8,9};
        for (int elem : arr){
            System.out.print(elem);
        }

        System.out.println();

        //SHALOW COPY
        int [] newarr = arr; // Shalow copy, it is not complete copy it act like pass by
        // reference , in this newarr refer to arr means if do any kind of change in
        // newarr it will be change in arr to, newarr is pointing to the same item in memory
        newarr[0]= 100;
        System.out.println(arr[0]); // it will be 100 not 3

        System.out.println();

        // DEEP COPY
        int [] newarr1 = Arrays.copyOf(arr, arr.length); // Deep copy
        // Deep copy is like pass by value it creates seperate space in memory , not
        // pointing to the same memory like shallow copy in this change in
        // copy newarr1 will not reflect in arr

        newarr1[1] = 200;
        for (int elem : newarr1){
            System.out.println(elem);
        }

        int[]  crr = new int[arr.length]; // it will creat the same size of array as arr

        for (int i = 0; i <arr.length; i++) {
            crr[i] = arr[i];

        }

//        for (int elem : newarr){
//            System.out.print(elem);
//        }

    }
}
