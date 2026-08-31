import java.util.Scanner;

public class Special {
    Scanner sc = new Scanner(System.in);
    // Odd number triangle
      /*  1
        1 3
        1 3 5             hint  n number a = 1,2,3,4,5,6,7,8,9,10
        1 3 5 7            odd number = 1, 3,5,7 , 9 == a*2-1
        1 3 5 7 9*/

    public void OddNumberTriangle() {
        System.out.println("Enter rows: ");
        int n = sc.nextInt();

//        for (int i = 1; i <=n; i++) {
////            for (int j = 1; j <= i; j++) {
////                System.out.print(2*j-1);
////            }
//            for (int j = 1; j <=2*i-1 ; j +=2 ) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }



        for (int i = 1; i <=n; i++) {
            int a=1;
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
                a=a+2;
            }
            System.out.println();
        }
    }

    public void floidsTriangle(){
        System.out.println("Enter Rows: ");
        int n = sc.nextInt();
        int a =1;
        for (int i = 1; i <=n ; i++) {           //  1
            for (int j = 1; j <=i ; j++) {       //  2 3
//                System.out.print("*");         //  4 5 6
                System.out.print(a + " ");        // 7 8 9 10
                a++;
            }
            System.out.println();

        }
    }

    public void binariTriangle(){
        System.out.println("Enter Rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");

              /*  if (i%2 != 0){
                    if (j%2 != 0)
                        System.out.print(1 + " ");
                    else
                        System.out.print(0 + " ");
                }

                else { // i%2==0
                    if (j%2 == 0 )
                        System.out.print(1 + " ");
                    else
                        System.out.print(0 + " ");
                }*/

                if ((i+j)%2 == 0)
                    System.out.print(1 + " ");
                else System.out.print(0 + " ");

            }
            System.out.println();

        }
    }

    public void triangleFliped() {
        System.out.println("Enter Rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if (i+j > n)
                    System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        System.out.println("Hello");
        Special s = new Special();
        s.triangleFliped();
    }
}
