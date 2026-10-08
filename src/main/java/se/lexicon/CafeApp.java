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

    }
}