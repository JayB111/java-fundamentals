package se.lexicon;
import java.util.Scanner;
public class ConverterApp {
    private static final double SEK_TO_USD = 10.87;
    private static final double SEK_TO_EUR = 11.32;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);
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
                    currencyConverter(scanner);
                    break;
                case 3:
                    bmiCalculator(scanner);
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
            System.out.printf(java.util.Locale.US,
                    "Result: %.2f C = %.2f F%n", celsius, fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5.0 / 9.0;
            System.out.printf(java.util.Locale.US,
                    "Result: %.2f F = %.2f C%n", fahrenheit, celsius);
        }
    }
    public static void currencyConverter(Scanner scanner) {
        System.out.println("--- Currency Converter ---");
        System.out.println("Convert SEK to:");
        System.out.println("1. US Dollars (USD)");
        System.out.println("2. Euros (EUR)");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter amount in SEK: ");
            double sek = scanner.nextDouble();
            double usd = sek / SEK_TO_USD;
            System.out.printf(java.util.Locale.US, "%.2f SEK = %.2f USD%n", sek, usd);
        }
        else if (choice == 2) {
            System.out.print("Enter amount in SEK: ");
            double sek = scanner.nextDouble();
            double eur = sek / SEK_TO_EUR;
            System.out.printf(java.util.Locale.US, "%.2f SEK = %.2f EUR%n", sek, eur);
        }
        else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }
    public static void bmiCalculator(Scanner scanner) {
        System.out.println("--- BMI Calculator ---");
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in metres: ");
        double height = scanner.nextDouble();
        if (weight <= 0 || height <= 0) {
            System.out.println("Weight and height must be greater than zero.");
            return;
        }
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("Your BMI is: %.2f%n", bmi);
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }
    }
}