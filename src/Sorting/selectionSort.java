package Sorting;

public class selectionSort {
    static void main(String[] args) {
            int[] arr = {-21,-4,20,1,-6,7,-9,30};
            int n = arr.length;

        for(int elem : arr){
            System.out.print(elem + " ");
        }
        for (int i = 0; i < n-1; i++) {
            int minINdex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minINdex]){
                   minINdex = j;
                }
            }

            // swap the current element with the minimum

            int temp = arr[i];
            arr[i] = arr[minINdex];
            arr[minINdex] = temp;

        }
        System.out.println();

        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }
}
