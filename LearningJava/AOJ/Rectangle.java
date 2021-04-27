import java.util.Scanner;

public class Rectangle {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i > 0; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if (H == 0 && W == 0) {
                break;
            }else {
                for (int j = 1; j <= H; j++) {

                    for ( int k = 1; k<= W; k++) {
                    
                        if(k == W) {
                            System.out.println("#");
                        }else {
                            System.out.print("#");
                            
                        }
                    
                    }
                
                if ( j == H) {
                    System.out.println("");
                }
                
                }
            }   
            
            
        }

    }

}
