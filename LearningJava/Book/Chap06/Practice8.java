import java.util.Scanner;

public class Practice8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("要素数：");
        int num = sc.nextInt();

        double[] numbers = new double[num];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("a[" + i + "] = ");
            numbers[i] = sc.nextDouble();

        }

        double sum = 0;

        for (double j : numbers) {

            sum += j;

        }

        System.out.println("全要素の和は" + sum + "です。");
        System.out.println("全要素の平均は" + sum / num + "です。");



    }

}
