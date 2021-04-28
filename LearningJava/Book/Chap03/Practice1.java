import java.util.Scanner;

public class Practice1 {
    
    public static void main(String[] args) { //整数値を読み込んでその絶対値を表示するプログラム

        Scanner sc = new Scanner(System.in);
        System.out.print("整数値：");
        int n = sc.nextInt();

        if (n >= 0) {
            System.out.println("その絶対値は" + n + "です。");
        }
        else {
            System.out.println("その絶対値は" + (-1 * n) + "です。");
        }


    }

}
