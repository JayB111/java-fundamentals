
package se.lexicon;
import java.util.Scanner;

public class ReceiptBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);
        StringBuilder receipt = new StringBuilder();
        double grandTotal = 0;
        while (true) {
            System.out.print("Enter item name (or 'done'): ");
            String itemName = scanner.nextLine();
            if (itemName.equalsIgnoreCase("done")) {
                break;
            }
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            receipt.append(String.format(java.util.Locale.US, "%-20s %.2f%n", itemName, price));
            grandTotal += price;
        }
        System.out.println();
        System.out.println("==============================");
        System.out.println("           Receipt");
        System.out.println("==============================");
        System.out.print(receipt);
        System.out.println("------------------------------");
        System.out.printf(java.util.Locale.US, "Grand Total:            %.2f%n", grandTotal);
        System.out.println("==============================");
    }
}
