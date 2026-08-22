package Arrays;

import java.util.Scanner;

public class basics {

    Scanner sc = new Scanner(System.in);

    public void arrayInitialization(){

        System.out.println("Enter Array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    public void arrayInitalize(){
        int[] arr = {2,3,4,5,5,6};
        int n = arr.length;
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public void Questions(){
        int[] arr = {45, 78, 23, 30,31,21,43, 78};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <35){
                System.out.println(i);
            }
        }
    }

    public void sum(){
        int[] arr = {45, 78, 23, 30,31,21,43, 78};

        int sum =0;
        for (int i = 0; i <arr.length ; i++) {
            sum = arr[i]+sum;
        }
        System.out.println(sum);
    }





    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

       /* int[] arr = new int[5]; // Array declaration

        // int[] arr; //Array declaration;
        // arr = new arr[5];  // Memory Allocation
        // initialization
        arr[0] = 10;
        arr[1] =20;
        arr[2] =20;
        arr[3] =20;
        arr[4] =20;

        System.out.println(arr[0]);

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        //Loop

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]);
        }*/


        basics b = new basics();
        b.sum();
    }







}
