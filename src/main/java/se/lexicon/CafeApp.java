package se.lexicon;
import java.util.Scanner;

public class CafeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome! What is your name? ");
        String customerName = scanner.nextLine();

        System.out.println("Hello " + customerName + "! Here is the menu:");

        showMenu();


        System.out.print("Enter the item number (1-5): ");
        int itemNumber = scanner.nextInt();

        if (itemNumber < 1 || itemNumber > 5) {
            System.out.println("Invalid item number. Please choose between 1 and 5.");
            scanner.close();
            return;
        }

        String itemName = getItemName(itemNumber);
        double unitPrice = getItemPrice(itemNumber);

        System.out.print("How many would you like? ");
        int quantity = scanner.nextInt();

        double subtotal = calculateSubtotal(unitPrice, quantity);

        System.out.print("Are you a loyalty member? (yes/no): ");
        String loyaltyAnswer = scanner.next();

        boolean isLoyaltyMember = loyaltyAnswer.equalsIgnoreCase("yes");


        double discount = calculateDiscount(subtotal, isLoyaltyMember);
        double priceAfterDiscount = subtotal - discount;
        double vat = calculateVat(priceAfterDiscount);
        double total = calculateTotal(priceAfterDiscount, vat);

        printReceipt(customerName, itemName,quantity,subtotal,
                discount,vat,total);
        scanner.close();
    }    public static void showMenu() {


        System.out.println();
        System.out.println("==============================");
        System.out.println("       Lexicon Cafe");
        System.out.println("==============================");
        System.out.println("1. Espresso         25.00 SEK");
        System.out.println("2. Cappuccino       35.00 SEK");
        System.out.println("3. Latte            40.00 SEK");
        System.out.println("4. Croissant        30.00 SEK");
        System.out.println("5. Sandwich         55.00 SEK");
        System.out.println("==============================");
    }
    public static double calculateSubtotal(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }
    public static double getItemPrice(int itemNumber) {

        if (itemNumber == 1) {
            return 25.00;
        }
        if (itemNumber == 2) {
            return 35.00;
        }
        if (itemNumber == 3) {
            return 40.00;
        }
        if (itemNumber == 4) {
            return 30.00;
        }
        if (itemNumber == 5) {
            return 55.00;
        }
        return 0;
    }
    public static String getItemName(int itemNumber) {
        if (itemNumber == 1) {
            return "Espresso";
        }
        if (itemNumber == 2) {
            return "Cappuccino";
        }
        if (itemNumber == 3) {
            return "Latte";
        }
        if (itemNumber == 4) {
            return "Croissant";
        }
        if (itemNumber == 5) {
            return "Sandwich";
        }
        return "Unknown item";    }

    public static double calculateDiscount(double subtotal, boolean isLoyaltyMember) {
        if (isLoyaltyMember) {
            return subtotal * 0.15;
        } else if (subtotal > 150) {
            return subtotal * 0.10;
        }
        return 0;
    }
    public static double calculateVat(double priceAfterDiscount) {
        return priceAfterDiscount * 0.12;
    }
    public static double calculateTotal(double priceAfterDiscount, double vat) {
        return priceAfterDiscount + vat;
    }
    public static void printReceipt(String customerName, String itemName,
                                    int quantity, double subtotal,
                                    double discount, double vat, double total) {
        System.out.println("Customer  : " + customerName);
        System.out.println("Item      : " + itemName + " x " + quantity);
        System.out.printf("Subtotal  : %.2f SEK%n", subtotal);
        System.out.printf("Discount  : -%.2f SEK%n", discount);
        System.out.printf("VAT       : %.2f SEK%n", vat);
        System.out.println("------------------------------");
        System.out.printf("TOTAL     : %.2f SEK%n", total);
        System.out.println("==============================");
        System.out.println("   Thank you, " + customerName + "!");
        System.out.println("   Have a great day!.");
        System.out.println("==============================");
    }
}