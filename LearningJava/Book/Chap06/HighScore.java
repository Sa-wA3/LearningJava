import java.util.Scanner;

public class HighScore {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int ninzu = 5;
        int[] tensu = new int[ninzu];

        System.out.println(ninzu + "人の点数を入力せよ。");
        for (int i = 0; i < ninzu; i++) {

            System.out.print((i + 1) + "番の点数：");
            tensu[i] = sc.nextInt();

        }

        int max = tensu[0];
        for (int i = 1; i< tensu.length; i++) {

            if(tensu[i] > max) {

                max = tensu[i];

            }

        }

        System.out.println("最高点は" + max + "点です。");
    }

}
