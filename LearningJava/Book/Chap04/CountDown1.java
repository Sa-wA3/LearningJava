import java.util.Scanner;

public class CountDown1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("カウントダウンします。");

        int x;
        do {
            System.out.print("正の整数値：");
            x = sc.nextInt();
        } while ( x <= 0);

        while (x >= 0) {
            System.out.println(x);
            x--;
        }
    }

}
