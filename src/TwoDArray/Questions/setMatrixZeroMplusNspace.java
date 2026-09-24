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


    public void setZeroswithoutusinganotherarray(int[][] arr){
        int m = arr.length, n = arr[0].length;
        boolean zeroRow = false;
        boolean zeroCol = false;

        // check the 0th row
        for (int i = 0; i < m; i++) {
            if (arr[0][i] == 0){
                zeroRow = true;
                break;
            }
        }

        // check the 0th col
        for (int j = 0; j < n; j++) {
            if (arr[j][0] == 0){
                zeroCol = true;
                break;
            }
        }


        // ...........Traverse in the submatrix...............

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n ; j++) {
                if (arr[i][j] == 0) {

                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // Traverse in the 0th row

        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0){ // set the jth col to zero
                for (int i = 1; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Traverse in the 0th col

        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0){ // set the ith row to zero
                for (int j = 1; j < n; j++) {
                    arr[i][j]  = 0;
                }
            }
        }

        // .............

        if (zeroRow == true){ // set the 0th row to zero
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        if (zeroRow == true){ // set the 0th col to zero
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }
        


    }
}
