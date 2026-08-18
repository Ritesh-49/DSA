import java.util.Scanner;

public class numberPyramidPalindrome {
    Scanner sc = new Scanner(System.in);

    public void Pyramid(){
        System.out.println("Enter n: ");
        int n= sc.nextInt();

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }

            for (int j = i-1; j >=1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }

    public  void starBridge(){
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i<=2*n-1 ; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();

        n--;

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print(" " + " ");
            }

            for (int j = 1; j <=n+1-i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }


    }

    public  void numberBridge(){
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i<=2*n-1 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        n--;

        for (int i = 1; i <=n ; i++) {
            int a=1;

            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print(a++ + " ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print(" " + " ");
                a++;
            }

            for (int j = 1; j <=n+1-i; j++) {
                System.out.print(a++ + " ");
            }

            System.out.println();
        }


    }

    public  static void main(String[] args) {
        numberPyramidPalindrome n = new numberPyramidPalindrome();
        n.numberBridge();
    }
}
