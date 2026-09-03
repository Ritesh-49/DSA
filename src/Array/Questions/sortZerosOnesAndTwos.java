package Array.Questions;

public class sortZerosOnesAndTwos {
    void method1(int [] arr, int noOfZeros , int noOfOnes){
        int n = arr.length;

        for (int i = 0; i < n; i++) { // Two pass algorithm
            if (arr[i] == 0) noOfZeros++;
            if (arr[i] == 1 ) noOfOnes++;
        }

        for (int i = 0; i < n; i++) {
            if (i<noOfZeros){
                arr[i] =0;
            }
           else if (i<noOfOnes + noOfZeros) {
                arr[i] = 1;
            }

            else arr[i] =2;
        }

        for (int elem : arr){
            System.out.print(elem + " ");
        }
    }

    void method2(){      // Duch flag Algorithm


        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;
        int mid = 0, lo = 0, high = n-1;

        while (mid <= high) {

            if (arr[mid] == 0){
                int t = arr[lo];
                arr[lo] = arr[mid];
                arr[mid] = t;
                mid++;
                lo++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {  // arr[mid] == 2
                int t = arr[mid];
                arr[mid] = arr[high];
                arr[high] = t;
                high--;
            }
        }

        for (int elem : arr){
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {0,1,0,2,0,2,2,1,0,1};
        int noOfZeros = 0, noOfOnes = 0;

        sortZerosOnesAndTwos s = new sortZerosOnesAndTwos();
//        s.method1(arr,noOfZeros,noOfOnes);
        s.method2();

    }
}
