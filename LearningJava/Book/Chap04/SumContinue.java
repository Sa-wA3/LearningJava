import java.util.Scanner;

public class SumContinue {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("整数を加算します。");
        System.out.print("何個加算しますか：");
        int n = sc.nextInt();

        int sum = 0;
        for ( int i = 0; i < n; i++) {

            System.out.print("整数：");
            int t = sc.nextInt();
            
            if (t < 0) {
                System.out.println("負の数は加算しません。");
                continue;
            }

            sum += t;

        }

        System.out.println("合計は" + sum + "です。");

    }

}
