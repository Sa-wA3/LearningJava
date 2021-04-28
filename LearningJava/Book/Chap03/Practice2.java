import java.util.Scanner;

public class Practice2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("整数値A：");
        int A = sc.nextInt();

        System.out.print("整数値B：");
        int B = sc.nextInt();

        if ( A % B == 0) {
            System.out.println("BはAの約数です。");
        }
        else {
            System.out.println("BはAの約数ではありません。");
        }

        sc.close();
    }

}
