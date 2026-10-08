package se.lexicon;

import java.util.Scanner;

public class CafeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome! What is your name? ");
        String customerName = scanner.nextLine();

        System.out.println("Hello " + customerName + "! Here is our menu:");

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

        System.out.print("Enter item number (1-5): ");
        int itemNumber = scanner.nextInt();

        String itemName = "";
        double unitPrice = 0;

        if (itemNumber == 1) {
            itemName = "Espresso";
            unitPrice = 25.00;
            System.out.println("You selected Espresso");
        }

        if (itemNumber == 2) {
            itemName = "Cappuccino";
            unitPrice = 35.00;
            System.out.println("You selected Cappuccino");
        }

        if (itemNumber == 3) {
            itemName = "Latte";
            unitPrice = 40.00;
            System.out.println("You selected Latte");
        }

        if (itemNumber == 4) {
            itemName = "Croissant";
            unitPrice = 30.00;
            System.out.println("You selected Croissant");
        }

        if (itemNumber == 5) {
            itemName = "Sandwich";
            unitPrice = 55.00;
            System.out.println("You selected Sandwich");
        }

        System.out.print("How many? ");
        int quantity = scanner.nextInt();

        double subtotal = calculateSubtotal(unitPrice, quantity);

        System.out.println("Subtotal: " + subtotal + " SEK");

        System.out.print("Are you a loyalty member? (yes/no): ");
        String loyaltyAnswer = scanner.next();

        boolean isLoyaltyMember = loyaltyAnswer.equalsIgnoreCase("yes");

        double discount = 0;

        if (isLoyaltyMember) {
            discount = subtotal * 0.15;
        } else if (subtotal > 150) {
            discount = subtotal * 0.10;
        }

        System.out.println("Discount: " + discount + " SEK");


        double priceAfterDiscount = subtotal - discount;
        double vat = priceAfterDiscount * 0.12;
        double total = priceAfterDiscount + vat;

        System.out.println("VAT: " + vat + " SEK");
        System.out.println("Total: " + total + " SEK");

    }

    public static double calculateSubtotal(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }
}