import java.util.Scanner;

public class Max3 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("整数a："); int a = sc.nextInt();
        System.out.print("整数b："); int b = sc.nextInt();
        System.out.print("整数c："); int c = sc.nextInt();

        int max = a;

        if (max < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        System.out.println("最大値は" + max + "です。");

    }

}
