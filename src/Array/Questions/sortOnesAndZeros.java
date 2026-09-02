package Array.Questions;

public class sortOnesAndZeros {

    void method1(int [] arr, int noOfZeros){    // array = {1,0,1,1,0,1,0,0,1,0}
        int n = arr.length;                     // sort = {0,0,0,0,0,1,1,1,1,1}

        for (int i = 0; i <n ; i++) {
            if (arr[i] == 0 )
                noOfZeros++;
        }

        for (int i = 0; i < n; i++) {
            if (i<noOfZeros)
                arr[i] = 0;
            else arr[i] =1;
        }

        for(int elem : arr){
            System.out.print(elem + " ");
        }

        System.out.println();
    }

    void method2(int [] arr){
        int n = arr.length;
        int i = 0 , j = n-1;

       /* while(i<j){
            if (arr[i] == 0) i++;
            if (arr[j] == 1) j--;
            if (i>j) break;
            if (arr[i] == 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }*/

        while(i<j){  // one pass
            if (arr[i] == 0) i++;
            if (arr[j] == 1) j--;
//            if (i>j) break;
            if (i<j && arr[i] == 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
        }
       /* while(i<j){
            if (arr[i] == 0){
                i++;
            }
            else if (arr[j] == 1){
                j--;
            }
//            if (i>j) break;
            else if (arr[i] == 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        } */



        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }

    static void main(String[] args) {
        int [] arr = {1,0,0,1,1,0,0,1,0,1,0};
        int noOfZeros = 0;

        sortOnesAndZeros s = new sortOnesAndZeros();
//        s.method1(arr, noOfZeros);

        int [] arr1 = {0,0,0,1,1,1};
        s.method2(arr1);
    }
}
