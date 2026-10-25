package Sorting;

public class insertiomsort {

    static void main(String[] args) {
        int [] arr = {3, 5, 1, 4, 2};

        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            for (int j = i; j >= 1 ; j--) {
//                if (arr[j] < arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//                else break;
//            }
//        }


//        USING WHILE LOOP
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j >= 1 &&arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;

            }
        }
        System.out.println();

        for(int elem : arr){
            System.out.print(elem + " ");
        }

    }
}
