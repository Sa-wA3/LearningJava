import java.util.Scanner;

public class Sort2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("変数a：");
        int a = sc.nextInt();

        System.out.print("変数b：");
        int b = sc.nextInt();

        if ( a > b) {
            int t = a;
            a = b;
            b = t;
        }

        System.out.println("a≦bとなるようにソートしました。");
        System.out.println("変数aは" + a + "です。");
        System.out.println("変数bは" + b + "です。");

    }

}
