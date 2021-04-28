import java.util.Scanner;

public class Sign {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("整数値：");
        int n = sc.nextInt();

        if (n > 0) { //　if文の中にif文（入れ子構造）
            System.out.print("その値は正です。");
        }
        else if (n < 0) {
            System.out.print("その値は負です。");
        }
        else {
            System.out.println("その値は0です。");
        }

    }

}
