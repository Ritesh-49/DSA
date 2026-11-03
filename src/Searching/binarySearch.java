package Searching;

public class binarySearch {
   public static void main(String[] args) {


       int [] arr =  {1,6,7,8,98};
        int n = arr.length;
       int low = 0;
       int high = n - 1;

       int target = 1;

       boolean flag = false;
       while (low <= high){
           int mid = low + (high - low)/2;
           if (arr[mid] == target) {
               flag = true;
               break;
           }
           else if (arr[mid] < target) low = mid +1;

           else if (arr[mid] > target) high = mid - 1;


       }

       if (flag == true){
           System.out.println("found");
       }
       else System.out.println("not found");

    }
}
