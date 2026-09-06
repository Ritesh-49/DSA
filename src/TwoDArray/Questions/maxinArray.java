package TwoDArray.Questions;

public class maxinArray {
    public static void main(String[] args) {
//        int [][] arr = new int[][];
        int [][] arr = {{2,3,4,}, {3,5,8}, {9,2,3},{3,6,7}} ;

//        int mx = arr[0][0];
        int mx = Integer.MIN_VALUE;


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
//                if (arr[i][j] > max){
//                    max = arr[i][j];
//                }

                mx = Math.max(mx, arr[i][j]);
            }
        }

        System.out.println(mx);

    }
}
