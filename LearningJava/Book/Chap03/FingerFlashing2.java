import java.util.Scanner;

public class FingerFlashing2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("手を選んでください (0.グー / 1.チョキ / 2.パー) :");
        int hand = sc.nextInt();

        switch (hand) { //breakしないと順次実行される
            case 0:
                System.out.println("グー");
                break;
            case 1:
                System.out.println("チョキ");
                break;
            case 2:
                System.out.println("パー");
                break;
        }

    }

}