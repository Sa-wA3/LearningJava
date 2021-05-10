import java.util.Scanner;

public class CarTester2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("車のデータを入力せよ。");
        System.out.print("名前は：");       String name = sc.next();
        System.out.print("車幅は：");       int width = sc.nextInt();
        System.out.print("高さは：");       int height = sc.nextInt();
        System.out.print("長さは：");       int length = sc.nextInt();
        System.out.print("ガソリン量は：");  double fuel = sc.nextDouble();
    
        Car myCar = new Car(name, width, height ,length, fuel);

    
        while (true) {
            System.out.println("現在地(" + myCar.getX() + ", " + myCar.getY() + ")・残り燃料 " + myCar.getFuel());
            System.out.print("移動しますか[0：No / 1:Yes]");
            if (sc.nextInt() == 0) {
                break;
            }
            System.out.print("X方向の移動距離：");
            double dx = sc.nextDouble();
            System.out.print("Y方向の移動距離：");
            double dy = sc.nextDouble();

            if(!myCar.move(dx, dy)) {
                System.out.println("燃料が足りません！");
            }

        }
    }
}
