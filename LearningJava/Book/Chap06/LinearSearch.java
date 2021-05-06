import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
    

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        final int n = 12;
        int[] a = new int[n];

        for (int j = 0; j < n; j++) {

            a[j] = rand.nextInt(10);

        }

        System.out.print("配列aの全要素の値\n{ ");
        for (int j = 0; j < n; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("}");

        System.out.print("探す数値：");
        int key = sc.nextInt();

        int i;

        for(i = 0; i < n; i++) {

            if(a[i] == key) {
                break;
            }
        }
        if(i < n) {
            System.out.println("それはa[" + i + "]にあります。");
        }else {
            System.out.println("それはありません。");
        }
        

    }

}
