
import java.util.Scanner;

public class ArithInt {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("xとyについて、加算乗除を行います");

    System.out.println("xの値は");
    int x = sc.nextInt();

    System.out.println("yの値は");
    int y = sc.nextInt();

    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);

    }

}