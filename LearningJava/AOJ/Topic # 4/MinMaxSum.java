import java.util.Scanner;
public class MinMaxSum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int min = 0;
        int max = 0;
        long sum = 0; //int型だと桁数超えるかもなので、long型にする
        boolean check = false;
        
        int[] numbers = new int[num];
        
        for (int i = 0; i<= num - 1; i++) {
            numbers[i] = sc.nextInt();
            check = false;
            if(i == 0) {
                min = numbers[i];
                max = numbers[i];

            }else {
                if(min >= numbers[i]) {
                    min = numbers[i];
                    check = true;
                }
                if (check == false && max <= numbers[i]) {
                    max = numbers[i];
                }
            }
            
            
            sum += numbers[i];
        }
        System.out.println(min + " " + max + " " + sum);
        
    }

}
