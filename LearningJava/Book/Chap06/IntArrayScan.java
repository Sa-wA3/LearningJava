import java.util.Scanner;

public class IntArrayScan {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("要素数：");
        int n = sc.nextInt();

        int[] a = new int[n];

        for ( int i = 0; i < a.length; i++) {

            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();

        }

        for ( int i = 0; i < a.length; i++) {

            System.out.println("a[" + i + "] = " + a[i]);

        }

    }

}
