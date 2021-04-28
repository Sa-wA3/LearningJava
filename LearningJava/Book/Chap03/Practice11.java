import java.util.Scanner;

public class Practice11 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("整数a：");
        int a = sc.nextInt();

        System.out.print("整数a：");
        int b = sc.nextInt();

        int diff = a > b ? a - b : b - a; //　式1 ? 式2 : 式3（まず式1を評価→trueなら式2を評価した値、そうでなければ式3を評価した値）
        System.out.println("それらの差は" + (diff >= 11 ? "11以上" : "10以下") + "です。");

    }

}
