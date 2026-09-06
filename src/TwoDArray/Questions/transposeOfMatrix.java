package TwoDArray.Questions;

public class transposeOfMatrix {
    public static void main(String[] args) {


        int [][] a = {{1,2},{3,4},{5,6}};

        int m = a.length;
        int n = a[0].length;

       /* for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }*/

        // transpose and store it in another array
        int [][] transpose = new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
//                System.out.print(a[i][j] + " ");
                transpose[j][i] = a[i][j];
                System.out.print(transpose[j][i] + " ");
            }
            System.out.println();
        }

    }
}
