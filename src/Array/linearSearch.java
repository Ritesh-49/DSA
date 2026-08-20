package Array;

import java.util.Scanner;

public class linearSearch {

    public void maxValue(){
        int[] arr = {12,2,5,9,0,1,6,10,6,77,43,32,99,};


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array element: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter Element to search: ");
        int s = sc.nextInt();


        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if( s == arr[i]){
                flag = true;
//                System.out.println(" the valu is matched: "+ arr[i]);
                break;
            }

        }
        if (flag== true){
            System.out.println("Found");
        }
        else {

            System.out.println("no");
        }



    }
}
