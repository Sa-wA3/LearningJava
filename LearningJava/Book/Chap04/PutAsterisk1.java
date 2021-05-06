import java.util.Scanner;

public class PutAsterisk1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("何個*を表示しますか：");
        int n = sc.nextInt();

        int i = 0;

        while (i < n) {
            System.out.print('*'); //「''」で囲んだ式が文字リテラル 型は「char」 文字列リテラル（String）とは異なるので注意
            i++;
        }

        System.out.println();

    }

}
