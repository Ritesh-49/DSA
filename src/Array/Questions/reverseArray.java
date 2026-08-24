package Array.Questions;

public class reverseArray {

    public void reverse1(){
        int [] arr = {2,4,6,7,9,10,1};
        for (int elem : arr){
            System.out.print(elem + " ");
        }
        System.out.println();

        int n = arr.length;
        for (int i = 0; i < n/2 ; i++) {

            int j = n-1-i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int elem : arr){
            System.out.print(elem + " ");
        }
    }

    void reverseUsingTwoPointer(){
        int [] arr = {2,4,6,7,9,10,1};
        for (int elem : arr){
            System.out.print(elem + " ");
        }

        System.out.println();


        int i = 0;
        int j = arr.length - 1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int elem : arr){
            System.out.print(elem + " ");
        }
    }

    void reverseUsingTwoPointerUsingFunction(){
        int [] arr = {2,4,6,7,9,10,1};
        for (int elem : arr){
            System.out.print(elem + " ");
        }

        System.out.println();
        int i = 0;
        int j = arr.length - 1;

        while(i<j){
            swap(arr, i, j); // function

            i++;
            j--;
        }

        for (int elem : arr){
            System.out.print(elem + " ");
        }
    }

    public static  void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {

        reverseArray r = new reverseArray();
        r.reverseUsingTwoPointerUsingFunction();

    }
}
