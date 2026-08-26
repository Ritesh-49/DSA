package Array.Questions;

public class rotateArray {
    // Rotate the given array " arr "  by k steps, where k is non-negative
    // NOTE k can be ggreater than n as well where n is the size of array 'a'

    public void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums , 0, n-k-1);
        reverse(nums , n-k, n-1);
        reverse(nums , 0 , n-1);

    }
    public static void main(String[] args) {
        int[] nums = {2,13,32,12,4,6,8};
        int k = 3 ; // k
        rotateArray r = new rotateArray();
        r.rotate(nums , k);
    }
}
