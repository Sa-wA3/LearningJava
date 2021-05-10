import java.util.Scanner;

public class LinearSearch {
    
    static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("要素数：");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = sc.nextInt();
        }

        System.out.print("探す値：");
        int ky = sc.nextInt();

        int idx = linearSearch(x, ky);

        if (idx == -1) {
            System.out.println("その値の要素は存在しません。");
        }else {
            System.out.println("その値はx[" + idx + "]にあります。");
        }

    }
}
