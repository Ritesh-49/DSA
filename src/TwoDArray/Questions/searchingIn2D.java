package TwoDArray.Questions;

public class searchingIn2D {

    public boolean searchInMatrix(int[][] arr, int target){
        int m = arr.length, n = arr[0].length;
        int i =0, j = n-1;

        while(i < m && j >= 0){
            if (arr[i][j] == target) return true;
            else if (arr[i][j] > target) {  // agar target value se arr[i][j] bda hai to as per shorted
                  j--;                         // array , arr[i][j] ke age sare element bda hoga. to hme ab age nhi jana hai
            }                                    // ab hm wahi se usi row me dhodege, aur col -- hoga to search in the array

            else {  // arr[i][j] < target value means target value is grater then curent column value it means
                i++;   // that the entire value of that row will less than the target value, then we will move to down in the column
            }
        }

        return false;

    }
    static void main(String[] args) {

    }
}
