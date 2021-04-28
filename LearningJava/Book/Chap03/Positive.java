import java.util.Scanner;

public class Positive {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("整数値：");
        int n = sc.nextInt();

        if (n > 0) { // if-then分の基本構造 if (制御式)
 
            System.out.println("その値は正です。"); //制御式を満たす場合に出力

        }
        //制御式を満たす場合には何も出力しない
    }
}
