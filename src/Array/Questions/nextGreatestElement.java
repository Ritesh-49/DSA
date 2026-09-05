package Array.Questions;

public class nextGreatestElement {

    public void method1(){
        int [] arr = {12, 60,41,37,2,49,16,28,21};
        int n = arr.length;
        int [] ans = new int[n];
        ans[n-1] = -1;


//        for (int i =0 ; i<n -1 ; i++){  // n-1 because we do not need to go at the last index
//            int max = arr[i + 1];
////            int max = Integer.MIN_VALUE;
//            for (int j =i+1; j<n ; j++){
//                if (arr[j] > max  ){
//                    max = arr[j];
////                    max = Math.max(max, arr[j]);
//
//
//                }
//            }
//
//            ans[i] = max;
//
//        }


        int nge = arr[n-1];
        for (int i = n-2; i >= 0  ; i-- ){
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }

        for (int elem : ans){
            System.out.print(elem + " ");
        }
    }
    public static void main(String[] args) {
        nextGreatestElement n = new nextGreatestElement();
        n.method1();



    }
}
