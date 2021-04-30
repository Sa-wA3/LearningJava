import java.util.Scanner;

public class circleinrectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int W = sc.nextInt(); //長方形の幅
        int H = sc.nextInt(); //長方形の高さ
        int x = sc.nextInt(); //円の中心のx座標
        int y = sc.nextInt(); //円の中心のy座標
        int r = sc.nextInt(); //円の半径
        
        if((0<=x-r) && (x+r<=W)) { //横に関して、円周がはみ出していないことを確認
            if((0<=y-r) && (y+r<=H)) { //縦に関して、円周がはみ出していないことを確認
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }else {
            System.out.println("No");   
        }
    }
}
