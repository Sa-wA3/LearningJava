import java.util.Scanner;

public class MaxHwaMethod {

    static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] height = new int[3]; 
        int[] weight = new int[3]; 
        int[] age    = new int[3];
        
        for (int i = 0; i < 3; i++) {

            System.out.print("[" + (i + 1) + "] ");
            System.out.print("身長：");
            height[i] = sc.nextInt();
            System.out.print("　　体重：");
            weight[i] = sc.nextInt();
            System.out.print("　　年齢：");
            age[i]    = sc.nextInt();

        }

        int maxHeight = max(height[0], height[1], height[2]);
        int maxWeight = max(weight[0], weight[1], weight[2]);
        int maxAge    = max(age[0], age[1], age[2]);

        System.out.println("身長の最大値は" + maxHeight + "です。");
        System.out.println("体重の最大値は" + maxWeight + "です。");
        System.out.println("年齢の最大値は" + maxAge    + "です。");
    }

}