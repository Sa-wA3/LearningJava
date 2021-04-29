import java.util.Scanner;

class SimpleCalculator {
    
    public static void main(String[] args) { //string型とchar型の違いについては勉強しましょう
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1;i>0;i++) {
            int a = sc.nextInt();
            char op = sc.next().charAt(0);// .charAt()について調べる
            int b = sc.nextInt();
        
            if (op == '+') {
                System.out.println(a + b);
            }else if (op == '-') {
                System.out.println(a - b);
            }else if (op == '*') {
                System.out.println(a * b);
            }else if (op == '/') {
                System.out.println(a / b);
            }else if (op == '?') {
                break;
            }   
        }
        
    }
    
}