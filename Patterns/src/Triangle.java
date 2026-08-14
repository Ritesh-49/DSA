import java.util.Scanner;

public class Triangle {
    Scanner sc = new Scanner(System.in);

    public void StarTriangle() {
        System.out.println("Enter number");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
//                System.out.print("*"+" ");
//                System.out.print((char)(i+64) );
//                System.out.print(j);

                if (i%2==0){
                    System.out.print((char)(j+64));
                }
                else {
                    System.out.print(j);
                }
            }
            System.out.println();

        }


    }

    public void ReverseStartTriangle(){
        System.out.println("enter rows: ");
        int n = sc.nextInt();

//        for (int i = 1; i <=n; i++) {
//            for(int j = 1; j<=n+1-i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
    public static void main(String[] arg){
        System.out.println("hello");
        Triangle t = new Triangle();
        t.ReverseStartTriangle();
    }
}
