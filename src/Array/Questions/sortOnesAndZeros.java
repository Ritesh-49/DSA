package Array.Questions;

public class sortOnesAndZeros {

    void method1(int [] arr, int noOfZeros){
        int n = arr.length;

        for (int i = 0; i <n ; i++) {
            if (arr[i] == 0 )
                noOfZeros++;
        }

        for (int i = 0; i < n; i++) {
            if (i<noOfZeros)
                arr[i] = 0;
            else arr[i] =1;
        }


    }

    static void main(String[] args) {
        int [] arr = {0,1,0,1,1,0,0,1,0,1,0};
        int noOfZeros = 0;

        sortOnesAndZeros s = new sortOnesAndZeros();
        s.method1(arr, noOfZeros);
    }
}
