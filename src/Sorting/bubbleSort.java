package Sorting;

public class bubbleSort {
    public static void print(int[] arr){
        for (int elem : arr){
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static  void method1(){
        int [] arr ={10,5,9,6,4,7,0};
        int n = arr.length;
        print(arr);

//        for (int j = 1; j <= n-1; j++) {
//            for (int i = 0; i < n - 1; i++) {
//                if (arr[i] >= arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//
//                }
//            }
//        }

          //Method 2

//        for (int x = 0; x < n-1; x++) {
//            for (int i = 0; i < n - 1 - x; i++) {
//                if (arr[i] >= arr[i+1]){
//                    int temp  = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//
//        }

//        Mthod 3
        for (int x = 0; x < n-1; x++) {  // n - 1  passes

            boolean flag = true;
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }


            // Optimization
//            boolean flag = true;
//            for (int i = 0; i < n-1 ; i++) {
//                if (arr[i]<arr[i+1]){
//                    flag = false;
//                    break;
//                }
//            }
            if (flag == true) break;
        }

        print(arr);
    }

    static void main(String[] args) {
     method1();


    }
}
