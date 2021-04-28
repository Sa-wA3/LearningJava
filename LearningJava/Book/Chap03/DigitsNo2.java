import java.util.Scanner;

public class DigitsNo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("整数値：");
        int n = sc.nextInt();

        if (n <= -10 || n >= 10) {
            System.out.println("2桁以上です。");
        }else {
            System.out.println("2桁未満です。");
        }

    }

}
