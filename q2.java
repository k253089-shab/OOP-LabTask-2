import java.util.Scanner;

public class MultiplyDoubles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double product = a * b;

        System.out.printf("Product = %.2f%n", product);
    }
}
