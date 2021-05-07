public class ArraySumForIn {
    
    public static void main(String[] args) {

        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

        for (int i = 0; i < a.length; i++) {

            System.out.println("a[" + i + "] = " + a[i]);

        }

        double sum = 0;

        for (double i : a) { //拡張for文（for-in文・for-each文）

            sum += i;

        }

        System.out.println("全要素の和は" + sum + "です。");

    }

}
