import java.util.Scanner;

public class SquareRectangle {
    
    static void putChars(char c, int n) {

        while (n-- > 0) {

            System.out.print(c);

        } 

    }

    static void putSquare(int n) {

        for (int i = 1; i <= n; i++) {

            putChars('+', n);
            System.out.println();

        }

    }

    static void putRectangle(int h, int w) {

        for (int i = 1; i <= h; i++) {

            putChars('*', w);
            System.out.println();

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("正方形を表示します。"); 
        System.out.print("一辺は：");
        int n = sc.nextInt();
        putSquare(n);

        System.out.println("長方形をを表示します。");        
        System.out.print("高さは：");
        int h = sc.nextInt();
        System.out.print("横幅は：");
        int w = sc.nextInt();
        putRectangle(h, w);



    }

}
