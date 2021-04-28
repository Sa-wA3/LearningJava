import java.util.Scanner;

public class Practice9 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("整数a：");
        int a = sc.nextInt();

        System.out.print("整数a：");
        int b = sc.nextInt();

        int max = a > b ? a : b; //　式1 ? 式2 : 式3（まず式1を評価→trueなら式2を評価した値、そうでなければ式3を評価した値）

        System.out.println("大きい方の値は" + max + "です。");

    }

}
