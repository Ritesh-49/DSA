package Array.Questions;

public class reverseArray {

    public void reverse1(){
        int [] arr = {2,4,6,7,9,10,1};
        for (int elem : arr){
            System.out.print(elem + " ");
        }
        System.out.println();

        int n = arr.length;
        for (int i = 0; i < n/2 ; i++) {

            int j = n-1-i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int elem : arr){
            System.out.print(elem + " ");
        }
    }
    public static void main(String[] args) {

        reverseArray r = new reverseArray();
        r.reverse1();

    }
}
