import java.util.Scanner;

public class Practice8 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        do {

            System.out.print("整数値：");
            n = sc.nextInt();

        } while (n <= 0);

        int digits = 0;
        

        while (n > 0 ) {

            n /= 10;
            digits++;

        }

        System.out.println("その値は" + digits + "桁です。");
    }

}
