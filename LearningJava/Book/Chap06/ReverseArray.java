import java.util.Scanner;
import java.util.Random;

public class ReverseArray {
    
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("要素数：");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = rand.nextInt(90);
            System.out.println("a[" + i + "] = " + a[i]);

        }

        for (int i = 0; i < n / 2; i++) {
            int t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;

        }

        System.out.println("要素の並びを反転しました。");
        for (int i = 0; i < n; i++) {

            System.out.println("a[" + i + "] = " + a[i]);

        }


    }

}
