import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double num = sc.nextDouble();
        double Pi = Math.PI;
        
        double area = num * num * Pi;
        double cir = 2 * num * Pi;
        
        System.out.println(String.format("%.6f", area) + " " + String.format("%.6f", cir));
        
    }
}
