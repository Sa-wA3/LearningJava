import java.util.Scanner;

public class MaxOfHeightWeight {

    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
            
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("人数は：");
        int ninzu = sc.nextInt();

        int[] height = new int[ninzu];
        int[] weight = new int[ninzu];

        System.out.println(ninzu + "人の身長と体重を入力せよ。");

        for (int i = 0; i < ninzu; i++) {
            System.out.print((i + 1) + "番目の身長");
            height[i] = sc.nextInt();
            System.out.print((i + 1) + "番目の体重");
            weight[i] = sc.nextInt();

        }

        System.out.println("最も背が高い人の身長：" + maxOf(height) + "cm");
        System.out.println("最も太っている人の体重：" + maxOf(weight) + "kg");
    }
}
