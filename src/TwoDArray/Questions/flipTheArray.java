package TwoDArray.Questions;

public class flipTheArray {



    public int matrixScore(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;

        // put 1  at the zeroth position of every row

        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0){  // flip that row
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 0) arr[i][j] = 1;
                    else arr[i][j] = 0;

                }
            }
        }

        // flip those columns where (no of 0s > no of 1s)

        for (int j = 1; j <n ; j++) {  // column
            int noOfOnes =0, noOfZeros = 0;
            for (int i =0; i < m; i++) {  // row
                    if (arr[i][j] == 0) noOfZeros++;
                else noOfOnes++;
            }

            if (noOfZeros > noOfOnes) {  // flip that column
                for (int i =0; i < m; i++) {  // row
                   if (arr[i][j] == 0) arr[i][j] = 1;
                   else arr[i][j] =0;

                }
            }
        }


        //binary to decimal convert, the elemens of the array;
//        calculating the maximum sum

        int score = 0;
        int x =1;

        for (int j = n-1; j >= 0 ; j--) {
            for (int i = 0; i < m; i++) {
                score += (arr[i][j]*x);
            }
            x *= 2;
        }

        return score;
        
    }
    static void main(String[] args) {


        // flip the element of the array  and find the max sum ,,  after fliping the element maximum time or after maximum fliping


    }
}
