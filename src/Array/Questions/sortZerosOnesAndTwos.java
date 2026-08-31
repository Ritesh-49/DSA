package Array.Questions;

public class sortZerosOnesAndTwos {
    void method1(int [] arr, int noOfZeros , int noOfOnes){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) noOfZeros++;
            else if (arr[i] == 1 ) noOfOnes++;

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
    public static void main(String[] args) {
        int [] arr = {0,1,0,2,0,2,2,1,0,1};
        int noOfZeros = 0, noOfOnes = 0;

        sortZerosOnesAndTwos s = new sortZerosOnesAndTwos();
        s.method1(arr,noOfZeros,noOfOnes);

    }
}
