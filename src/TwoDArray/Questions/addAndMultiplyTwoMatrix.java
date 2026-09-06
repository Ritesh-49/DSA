package TwoDArray.Questions;

public class addAndMultiplyTwoMatrix {
    public static void main(String[] args) {
        int [][] a = {{2,3,4,}, {3,5,8}, {9,2,3},{3,6,7}};
        int [][] b = {{2,3,4,}, {3,5,8}, {9,2,3},{3,6,7}};

        int m = a.length;
        int n = b[0].length;

        int[][] resultent = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultent[i][j] = a[i][j] + b[i][j];

                a[i][j] = a[i][j] + b[i][j];
            }

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                System.out.print(resultent[i][j] + " ");
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
        
    }
}
