package Sorting.questions;

public class basics {

    // using selection sort
//    sort a given Array in increasing order using selection sort, but i each pass,
//    put the kth maximum element at the right

    public static void  sortSelection(){
        int [] arr = {10,5,9,6,4,7,0};

        int n = arr.length;

        for (int x = n - 1; x > 0 ; x--) {
            int minIndex = 0;
            for (int i = 1; i <= x ; i++) {
                if (arr[i] > arr[minIndex]){
                    minIndex  = i;
                }
            }

//            swap

            int temp = arr[x];
            arr[x] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }
  public  static void main(String[] args) {
        int [] arr = {10,5,9,6,4,7,0};

        int n = arr.length;

        for (int x = 0; x < n-1; x++) {
            boolean flag = true; // already sorted
            for (int i = 0; i < n-1-x; i++) {
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag  = false;
                }
            }

            if (flag = true) break;
        }

//        for(int elem : arr){
//            System.out.print(elem + " ");
//        }

      sortSelection();
    }





}
