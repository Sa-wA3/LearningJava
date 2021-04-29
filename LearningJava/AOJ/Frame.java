import java.util.Scanner;

public class Frame {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i > 0; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if (H == 0 && W == 0) {
                break;
            }else {
                for (int j = 1; j <= H; j++) { //ここから描画処理（初めの行と最終行の時は全部、それ以外は端のみ）
                    
                    if (j == 1 || j == H) { //初めの行か最終行の場合
                        for ( int k = 1; k<= W; k++) {
                    
                            if(k == W) { //右端まで入力後、折り返し
                                System.out.println("#");
                            }
                            else { //通常の入力
                                System.out.print("#");
                            }
                        
                        }
                    }else { //その他の行の場合
                        for ( int k = 1; k<= W; k++) {
                            
                            if(k == W) { //右端まで入力後、折り返し
                                System.out.println("#");
                            }
                            else if(k == 1) {
                                System.out.print("#");
                            }
                            else { //通常の入力
                                System.out.print(".");
                            }
                        
                        }
                    }

                
                    if ( j == H) { //図形描画後にスペースを入力
                        System.out.println("");
                    }
                }
            }   
            
            
        }

    }

}
