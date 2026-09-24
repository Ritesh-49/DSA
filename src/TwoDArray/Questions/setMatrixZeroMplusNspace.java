package TwoDArray.Questions;

public class setMatrixZeroMplusNspace {
    public void setZeros(int[][] arr){
        int m = arr.length, n = arr[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];


        // by default the boolean value is false, means fals is written in array already

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // set the true row to zero
        for (int i = 0; i < m; i++) {
            if (row[i] == true){ // set ith row to zero
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // set the true col to zero
        for (int j = 0; j < n; j++) {
            if (col[j] == true){ // set jth col to zero
                for (int i = 0; i < m; m++) {
                    arr[i][j] = 0;
                }
            }
        }


    }
}
