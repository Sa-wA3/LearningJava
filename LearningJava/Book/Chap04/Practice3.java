import java.util.Scanner;

public class Practice3 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("整数A：");
        int A = sc.nextInt();
        System.out.print("整数B：");
        int B = sc.nextInt();
        int x;

        if ( A > B){
            x = B;
            do {
                if (x == A) {
                    System.out.println(x);
                    break;
                }
                System.out.print(x + " ");
                x++;
            } while(x <= A);

        }else if (A < B) {
            x = A;
            do {
                if (x == B) {
                    System.out.println(x);
                    break;
                }
                System.out.print(x + " ");
                x++;;
            } while(x <= B);
        }else {
            x = A;
            System.out.println(x);
        }

    }

}
