import java.util.Scanner;

class sortThreeNumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt();
        int tmp;
        
        if (a<=b && a<=c) { //aが最小の場合
            if(b<c) { //a→b→cの場合 →入れ替えなし
                System.out.println(a + " " + b + " " + c);       
            }else { //a→c→bの場合 →bとcを入れ替える
                tmp = c; //cを一時保存
                c = b; //cにbを代入（bとcの入れ替えその1）
                b = tmp; //bにtmpを代入（bとcの入れ替えその2）
                
                System.out.println(a + " " + b + " " + c);       
            } 
        }else if(a>=b && b<=c) { //bが最小の場合
            if(a<c) { //b→a→cの場合 →aとbを入れ替える
                tmp = a; //aを一時保存
                a = b; //aにbを代入（aとbの入れ替えその1）
                b = tmp; //bにtmpを代入（aとbの入れ替えその2）
                
                System.out.println(a + " " + b + " " + c);       
            }else { //b→c→aの場合 →aとbを入れ替えた後に、bとcを入れ替える
                tmp = a; //aを一時保存
                a = b; //aにbを代入（aとbの入れ替えその1）
                b = tmp; //bにtmpを代入（aとbの入れ替えその2）
                //この時点で、a→c→bになった
                
                tmp = c; //cを一時保存
                c = b; //cにbを代入（bとcの入れ替えその1）
                b = tmp; //bにtmpを代入（bとcの入れ替えその2）
                
                System.out.println(a + " " + b + " " + c);
            }
        }else if(a>=c && b>=c) { //cが最小の場合
            if(a>b) { //c→b→aの場合 →aとcを入れ替える
                tmp = c; //cを一時保存
                c = a; //cにaを代入（aとcの入れ替えその1）
                a = tmp; //aにtmpを代入（aとcの入れ替えその2）
                
                System.out.println(a + " " + b + " " + c);
            }else { //c→a→bの場合 →aとcを入れ替えた後に、bとcを入れ替える
                tmp = c; //cを一時保存
                c = a; //cにaを代入（aとcの入れ替えその1）
                a = tmp; //aにtmpを代入（aとcの入れ替えその2）
                //この時点で、a→c→bになった
                
                tmp = c; //cを一時保存
                c = b; //cにbを代入（bとcの入れ替えその1）
                b = tmp; //bにtmpを代入（bとcの入れ替えその2）
                
                System.out.println(a + " " + b + " " + c);
            }
        
        }
        
    }
}