import java.util.Scanner;

public class composite {
    Scanner sc = new Scanner(System.in);

    public void NumberTriangleVerticalFliped(){
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void rhombus(){
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }

    public void piramid(){
        System.out.print("Enter n:");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public void StarDimond(){
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*" + " ");
            }


            System.out.println();
        }

        for (int i = 1; i < n; i++) {

            // Spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void main(String [] args){
        System.out.println("Ritesh");

        composite c = new composite();
        c.StarDimond();
    }
}
