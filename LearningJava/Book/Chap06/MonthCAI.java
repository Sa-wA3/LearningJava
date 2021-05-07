import java.util.Scanner;
import java.util.Random;

public class MonthCAI {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String[] monthString = {

            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "Novemver", "December"

        };

        int month = rand.nextInt(12);
        System.out.println("問題は" + monthString[month]);

        while (true) {

            System.out.print("何月かな：");
            int m = sc.nextInt();

            if (m == month + 1) {

                break;

            }else {
                System.out.println("不正解です。");
            }

        }

        System.out.println("正解です。");

    }

}



