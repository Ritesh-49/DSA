import java.util.Scanner;

public class star {
    Scanner sc = new Scanner(System.in);

    public void starPlus(){
        System.out.println("Enter rows: ");
        int n = sc.nextInt();
        int mid = n/2 + 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j==mid || i==mid){
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }
    }

    public void starCross(){
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
//                if (i==j || j==n+1-i){
//                    System.out.print("*");
//                }

                if (i==j || i+j == n + 1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" "+ " ");
                }


            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        star s = new star();
        s.starCross();
    }
}
