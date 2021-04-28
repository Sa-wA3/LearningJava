import java.util.Random; //乱数を生成する場合にはjava.util.Randomをインポート

public class Practice17 {
    
    public static void main(String[] args) {

        Random rand = new Random(); //乱数を生成するインススタンスを初期化

        System.out.println("手を自動で選択します (0.グー / 1.チョキ / 2.パー)");
        int hand = rand.nextInt(3);

        switch (hand) { //breakしないと順次実行される
            case 0:
                System.out.println(hand + "が選択されました。");
                System.out.println("グー");
                break;
            case 1:
                System.out.println(hand + "が選択されました。");
                System.out.println("チョキ");
                break;
            case 2:
                System.out.println(hand + "が選択されました。");
                System.out.println("パー");
                break;
        }

    }

}