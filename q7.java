import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double subtotal = 0.0;
        String choice;

        System.out.println("Enter items (item name then price):");

        while (true) {
            String item = sc.next();
            double price = sc.nextDouble();

            subtotal += price;

            System.out.print("Stop? (y/n): ");
            choice = sc.next();

            if (choice.equalsIgnoreCase("y")) {
                break;
            }
        }

        double discountPercent = 10;
        double taxPercent = 5;

        double discountAmount = subtotal * discountPercent / 100;
        double totalBeforeTax = subtotal - discountAmount;
        double salesTax = totalBeforeTax * taxPercent / 100;
        double invoiceTotal = totalBeforeTax + salesTax;

        System.out.println("\nSubtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Discount percent: " + (int) discountPercent);
        System.out.println("Discount amount: $" + String.format("%.2f", discountAmount));
        System.out.println("Total before tax: $" + String.format("%.2f", totalBeforeTax));
        System.out.println("Sales tax: " + (int) taxPercent);
        System.out.println("Invoice total: $" + String.format("%.2f", invoiceTotal));

        sc.close();
    }
}
