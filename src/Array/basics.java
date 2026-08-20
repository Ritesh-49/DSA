package Array;

import java.awt.image.LookupOp;
import java.util.Scanner;

public class basics {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5]; // Array declaration

        // initialization
       /* arr[0] = 10;
        arr[1] =20;
        arr[2] =20;
        arr[3] =20;
        arr[4] =20;*/

        System.out.println(arr[0]);

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        //Loop

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]);
        }
    }







}
