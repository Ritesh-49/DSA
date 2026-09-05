package TwoDArray;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
//        System.out.println("Hello");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ente the 2D array elements: ");

        int [][] arr = new int[3][3];
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
