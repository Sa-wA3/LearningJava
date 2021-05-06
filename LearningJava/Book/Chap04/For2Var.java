import java.util.Scanner;

public class For2Var {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("整数値");
        int n = sc.nextInt();

        for ( int i = 1, j = n - 1;  i <= n; i++, j--) {

            System.out.println(i + " " + j);

        }


    }

}
