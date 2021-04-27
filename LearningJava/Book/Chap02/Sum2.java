public class Sum2 {
    
    public static void main(String[] args) {

        System.out.println("16 + 24 = " + 16 + 24); //左側からの演算が実行（16と24はそれぞれ文字列に変換）

        System.out.println(16 + 24 + "は16と24の和です"); //左側からの演算が実行（16と24が先に計算されて連結）

        //System.out.println("16 + 24 = " + 16 - 24);
        //これはコンパイルエラーになる（文字列から数値を引くことになるので）

    }

}
