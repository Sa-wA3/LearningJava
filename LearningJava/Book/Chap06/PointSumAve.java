import java.util.Scanner;

public class PointSumAve { //ベタ打ちバージョン

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.println("5人の点数を入力せよ。");

        System.out.print("1番の点数：");
        int yamane = sc.nextInt();
        sum += yamane;

        System.out.print("2番の点数：");
        int takada = sc.nextInt();
        sum += takada;

        System.out.print("3番の点数：");
        int kawachi = sc.nextInt();
        sum += kawachi;

        System.out.print("4番の点数：");
        int koga = sc.nextInt();
        sum += koga;

        System.out.print("5番の点数：");
        int tozuka = sc.nextInt();
        sum += tozuka;

        System.out.println("合計は" + sum + "点です。");
        System.out.println("平均は" + (double)sum / 5 + "点です。");

    }
    
}
