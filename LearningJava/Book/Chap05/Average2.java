import java.util.Scanner;

public class Average2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("xとyの平均値を求めます。");
        System.out.print("xの値："); int x = sc.nextInt();
        System.out.print("yの値："); int y = sc.nextInt();

        double ave = (x + y) / 2.0;

        System.out.println("xとyの平均値は" + ave + "です。"); //正しい出力がされる


    }

}
