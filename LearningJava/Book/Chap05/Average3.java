import java.util.Scanner;

public class Average3 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("xとyの平均値を求めます。");
        System.out.print("xの値："); int x = sc.nextInt();
        System.out.print("yの値："); int y = sc.nextInt();

        double ave = (double)(x + y) / 2;

        System.out.println("xとyの平均値は" + ave + "です。"); //正しい出力がされる


    }

}
