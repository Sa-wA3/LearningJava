import java.util.Scanner;

public class FingerFlashing {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hand;

        do {
            System.out.print("手を選んでください（0.グー 1.チョキ 2.パー）：");
            hand = sc.nextInt();
        } while (hand < 0 || hand > 2);

        switch (hand) {
            case 0:
                System.out.println("グー");
                break; //これ忘れがちßß
            case 1:
                System.out.println("チョキ");
                break;
            case 2:
                System.out.println("パー");
                break;

        }
    }

}
