import java.util.Scanner;
public class ABproblem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int d = a / b;
        int r = a % b;
        double f = (double)a / (double)b;
        
        System.out.println(d + " " + r + " " + String.format("%.8f", f)); // String.formatメソッドによる表示桁数の指定
    }
}
