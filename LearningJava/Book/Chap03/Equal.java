import java.util.Scanner;

public class Equal {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("整数値a：");
        int a = sc.nextInt();

        System.out.print("整数値b：");
        int b = sc.nextInt();

        if (a == b) { //「==」「!=」は等価演算子
            System.out.println("二つの値は等しいです。");
        }
        else {
            System.out.println("二つの値は等しくありません。");
        }

        sc.close();
    }

}
