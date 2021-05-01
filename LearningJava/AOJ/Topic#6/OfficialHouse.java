import java.util.Scanner;
import java.util.Arrays;

public class OfficialHouse {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int infoNum = sc.nextInt();

        int[][][] buildings = new int [4][3][10];
        Arrays.fill(buildings, 0); //３次元配列の全ての要素に対して0を設定（Arraysクラスのメソッド利用）

        for (int i = 1; i <= infoNum; i++) {

            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();

            buildings[i-1][f-1][r-1] += v;

        }

        System.out.println(buildings);

        

    }

}
