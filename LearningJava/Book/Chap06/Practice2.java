public class Practice2 {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = 5 - i;

        }

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("numbers[" + i + "] = " + numbers[i]);

        }

    }
}
