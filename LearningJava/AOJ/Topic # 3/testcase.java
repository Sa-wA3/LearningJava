import java.util.Scanner;

class testcase {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        for(int i=1;i>0;i++) {
            
            num = sc.nextInt();
            if(num!=0) {
                System.out.println("Case " + i + ": " + num );    
            }else {
                break;
            }
        }

        sc.close();
    }
}
