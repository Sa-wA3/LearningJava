import java.util.Scanner;

public class Practice1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("整数：");
        int n = sc.nextInt();


        System.out.printf("8進数では%oです。",n);
        System.out.println();
        System.out.printf("16進数では%xです。",n);
        System.out.println();
        }

}


