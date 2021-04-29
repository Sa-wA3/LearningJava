import java.util.Scanner;

public class StructuredProgramming {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0; 

        for ( int i = 1; i <= n; i++) {
            int valLen = String.valueOf(i).length();
            if (i % 3 == 0) { //3の倍数の場合
                System.out.print(" " + i);
            }else if ( i % 10 == 3) { //末尾が3の場合
                System.out.print(" " + i);
            }else { //それ以外
                for (int j = 1; j < valLen; j++) { //10で割っていき、末尾に3が出てきたら出力
                    if (j == 1) { 
                        num = i / 10;
                    }else {
                        num /= 10;
                    }

                    if (num % 10 == 3) {
                        System.out.print(" " + i);
                        break;
                    }
                }
            }
            if (i == n) {
                System.out.println();
            }
        }
    }
}
