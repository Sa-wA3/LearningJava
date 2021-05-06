import java.util.Scanner;

public class SumBreak1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("整数を加算します。");
        System.out.print("何個加算しますか：");
        int n = sc.nextInt();

        int sum = 0;

        for ( int i = 0; i < n; i++) {

            System.out.print("整数（0で終了）：");
            int t = sc.nextInt();
            if ( t == 0) {
                break;
            }
            sum += t;

        }
        System.out.println("合計は" + sum + "です。");
    }

}
