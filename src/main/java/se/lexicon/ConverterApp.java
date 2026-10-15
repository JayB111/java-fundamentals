package se.lexicon;
import java.util.Scanner;
public class ConverterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("==================================");
            System.out.println("      LEXICON CONVERTER APP");
            System.out.println("==================================");
            System.out.println("1. Temperature Converter");
            System.out.println("2. Currency Converter");
            System.out.println("3. BMI Calculator");
            System.out.println("4. Exit");
            System.out.println("==================================");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    temperatureConverter(scanner);
                    break;
                case 2:
                    System.out.println("Currency Converter selected.");
                    break;
                case 3:
                    System.out.println("BMI Calculator selected.");
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1-4.");
                    break;
            }
        }
        scanner.close();
    }
    public static void temperatureConverter(Scanner scanner) {
        System.out.println("--- Temperature Converter ---");
        System.out.println("Convert:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsius * 9.0 / 5.0 + 32;
            System.out.printf("Result: %.2f C = %.2f F%n",
                    celsius, fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5.0 / 9.0;
            System.out.printf("Result: %.2f F = %.2f C%n",
                    fahrenheit, celsius);
        }
    }
}