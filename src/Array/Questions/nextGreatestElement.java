package Array.Questions;

public class nextGreatestElement {
    public static void main(String[] args) {
        int [] arr = {12, 8,41,37,2,49,16,28,21};
        int n = arr.length;
        int [] ans = new int[n];
        ans[n-1] = -1;


        for (int i =0 ; i<n -1 ; i++){  // n-1 because we do not need to go at the last index
            int max = arr[i + 1];
            for (int j =i+1; j<n ; j++){
                if (arr[j] > max  ){
                    max = arr[j];

                }
            }

            ans[i] = max;

        }
        for (int elem : ans){
            System.out.print(elem + " ");
        }

    }
}
