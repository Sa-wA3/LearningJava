import java.util.Random;
import java.util.Scanner;

public class IntArrayRand {
    
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("要素数：");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {

            a[i] = rand.nextInt(10);

        }

        for (int i = 0; i < a.length; i++) {

            System.out.print("a[" + i + "] = ： ");

            for (int j = 0; j < a[i]; j++) {

                System.out.print('*');

            }
            System.out.println();
        }


    }

}
