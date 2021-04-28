import java.util.Scanner;

public class SwitchBreak {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("整数：");
        int n = sc.nextInt();

        switch (n) {
            case 0:
                System.out.println("A");
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            case 5:
                System.out.println("D");
                break;
            case 6:
            // break;がないため、case 7:の処理が実行される
            case 7:
                System.out.println("E");
                break;
            default: //各ケースに該当しない場合の処理
                System.out.println("F");
                break;
        }
        System.out.println();
        //if文とswitch文のどちらを使っても実現できる分岐については、switch文の方が読みやすくなる傾向がある
    }

}
