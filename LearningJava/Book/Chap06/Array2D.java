import java.util.Scanner;
import java.util.Random;

public class Array2D {
    
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("行数：");
        int h = sc.nextInt();

        System.out.print("列数：");
        int w = sc.nextInt();

        int[][] x = new int[h][w];

        for (int i = 0; i < h; i++) {

            for (int j = 0; j < w; j++) {

                x[i][j] = rand.nextInt(100);
                System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);

            }

        }

    }

}
