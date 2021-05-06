import java.util.Scanner;

public class PointSumAveArray { //ベタ打ちバージョン

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        final int ninzu = 5;
        int[] tensu = new int[ninzu];

        System.out.println(ninzu + "人の点数を入力せよ。");

        for (int i = 0; i < ninzu; i++) {

            System.out.print((i + 1) + "人目の点数：");
            tensu[i] = sc.nextInt();
            sum += tensu[i];
        }

        System.out.println("合計は" + sum + "点です。");
        System.out.println("平均は" + (double)sum / ninzu + "点です。");

    }
    
}
