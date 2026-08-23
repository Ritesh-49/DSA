package Array.Questions;

public class twoSum { // sum of two elements from array is equal to the given number
    public static void main(String[] args) {
        int[] arr = {2,4,7,8,9,3, 5, 6};

        int n = 9; // the number
        int l = arr.length;
        for (int i = 0; i <l; i++) {
            boolean flag = false; //Optimization
            for (int j = i+1; j <l ; j++) {
                if (arr[i] + arr[j] == n){
                    System.out.println(arr[i] + " " + arr[j]);
                    flag = true; //Optimization
                    break; //Optimization

                }
            }
            if (flag == true){ //Optimization
                break;
            }
        }



    }
}
