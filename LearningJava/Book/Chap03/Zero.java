import java.util.Scanner;

public class Zero {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("整数値：");
        int n = sc.nextInt();

        if (!(n != 0)) { //!によってオペランドの値を反転
            System.out.println("その値はゼロです。");
        }
        else {
            System.out.println("その値はゼロではありません。");
        }



    }

}
