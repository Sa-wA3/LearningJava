import java.util.Scanner;

public class Practice7 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("何個表示しますか：");
        int n = sc.nextInt();

        int i = 1;

        while (i <= n) {

            if ( i % 2 != 0) {
                System.out.print('*'); //「''」で囲んだ式が文字リテラル 型は「char」 文字列リテラル（String）とは異なるので注意
            }else {
                System.out.print('+');
            }
            
            i++;
        }

        System.out.println();

    }

}
