import java.util.Scanner;
import java.util.Random;

public class MentalArithmetic {
    
    static Scanner sc = new Scanner(System.in);

    static boolean confirmRetry() {
        int cont;
        do {
            System.out.print("もう一度？<Yes：1 / No：0>：");
            cont = sc.nextInt();
        } while (cont != 0 & cont != 1);

        return cont == 1;

    }

    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println("暗算力トレーニング！！");

        do {
            int x = rand.nextInt(900) + 100;
            int y = rand.nextInt(900) + 100;
            int z = rand.nextInt(900) + 100;

            while (true) {

                System.out.print(x + " + " + y + " + " + z + " = ");
                int k = sc.nextInt();
                if (k == x + y + z) {
                    break;
                }
                System.out.println("違いますよ！");
            }

        } while ( confirmRetry());

    }


}
