import java.util.Scanner;

class ReversingNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int arrLen = sc.nextInt();
        
        int numbers[] = new int[arrLen];
        
        for (int i = 0; i < numbers.length; i++) {
            
            numbers[i] = sc.nextInt();
        }
        
        for (int j = 0; j < numbers.length; j++) {
            
            if (j == numbers.length -1) {
                System.out.println(numbers[arrLen -1 - j]);
            }else {
                System.out.print(numbers[arrLen - 1 - j] + " ");   
            }
            
        }


    }

}