import java.util.Scanner;

public class ReverseArray {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
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

        reverse(x);

        System.out.println("要素の並びを反転しました。");
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
