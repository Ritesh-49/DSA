package TwoDArray.Questions;

public class sumOfElements {
    public static void main(String[] args) {
        int [][] arr = {{2,3,4,}, {3,5,8}, {9,2,3},{3,6,7}};
        int m = arr.length; // length of rows;
        int n = arr[0].length; // length of column
        int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }

        }
        System.out.println(sum);

    }
}
