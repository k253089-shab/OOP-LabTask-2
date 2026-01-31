import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.14159;

        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();

        double diameter = 2 * r;
        double circumference = 2 * PI * r;
        double area = PI * r * r;

        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        sc.close();
    }
}
