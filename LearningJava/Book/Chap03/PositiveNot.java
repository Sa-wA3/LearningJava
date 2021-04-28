import java.util.Scanner;

public class PositiveNot {    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("整数値：");

        int n = sc.nextInt();

        if (n > 0) { //if-then-else文の基本構造
            System.out.println("その値は正です。");
        }
        else {
            System.out.println("その値は0か負です。");
        }
    }

}
