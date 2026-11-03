package Searching.Questions;

public class lowerAndUpperBound {
    static void main(String[] args) {
        int [] arr = {10 , 20, 25, 30, 40, 50, 60, 70};

        int n = arr.length;
        int target = 30;

        int lb = n;
         int lo =0, high = n-1;

         while (lo<=high){

             int mid = lo + (high - lo)/2;
                 if (arr[mid] >= target){
                      lb = Math.min(lb, mid);
                      high = mid -1;
                 }
                 else lo = mid + 1;

         }

        System.out.println(lb+ " " + arr[lb]);

    }
}
