import java.util.Scanner;

public class Min2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("整数a：");
        int a = sc.nextInt();

        System.out.print("整数a：");
        int b = sc.nextInt();

        int min;

        if (a < b){
            min = a;
        }else {
            min = b;
        }

        System.out.println("小さい方の値は" + min + "です。");

    }

}
