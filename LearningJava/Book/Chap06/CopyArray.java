import java.util.Scanner;

public class CopyArray {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("要素数：");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++) {

            b[i] = a[i];

        }

        System.out.println("aの全要素をbにコピーしました。");

        for (int i = 0; i < n; i++) {

            System.out.println("b[" + i + "] = " + b[i]);

        }

    }

}
