package Sorting;

public class basics {
//    void main(){
//       IO.println("Hello");
//    }
//
//    chck if the array is sorted or not

    static void main(String[] args) {
        int [] arr = {3,7,8,1,0,43};

        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i < n-1 ; i++) {
            if (arr[i] <= arr[i+1]){
                flag = false;
                break;
            }
        }
        if (flag == true) System.out.println("sorted");
        else System.out.println("Unsorted");
    }
}
