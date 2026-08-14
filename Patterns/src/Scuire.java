import java.util.Scanner;
public class Scuire {

    Scanner sc = new Scanner(System.in);
    public void squire() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print('*');
            }
            System.out.println();

        }

    }
    public void NumSquire() {

        System.out.println("enter rows");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();

        }

    }

    public void LetterSquire() {
        System.out.println("Enter rows");
        int n = sc.nextInt();
        for(int i= 1; i<=n; i++){
            for(int j=1; j<=n; j++){
//                System.out.print( (char)(j+64)+  " ");
                System.out.print((char)(i+64));
//                System.out.print();
            }
            System.out.println();
        }
    }



    public static void main(String [] srg){
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows amd column");

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i =1; i<=n; i++){
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       Scuire s = new Scuire();
        s.LetterSquire();




    }



}
