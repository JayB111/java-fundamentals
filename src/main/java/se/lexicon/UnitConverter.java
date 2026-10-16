package se.lexicon;
import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion:");
        System.out.println("1. km → miles");
        System.out.println("2. kg → lbs");
        System.out.println("3. °C → °F / K");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter value in km: ");
            double km = scanner.nextDouble();
            double miles = convert(km);
            System.out.printf(java.util.Locale.US, "%.2f km = %.2f miles%n", km, miles);
        }
        else if (choice == 2) {
            System.out.print("Enter value in kg: ");
            double kg = scanner.nextDouble();
            double pounds = convert(kg, "lbs");
            System.out.printf(java.util.Locale.US, "%.2f kg = %.2f lbs%n", kg, pounds);
        }
        else if (choice == 3) {
            System.out.print("Enter value in Celsius: ");
            double celsius = scanner.nextDouble();
            System.out.print("Convert to Fahrenheit? (true/false): ");
            boolean toFahrenheit = scanner.nextBoolean();
            double result = convert(celsius, toFahrenheit);
            String unit = toFahrenheit ? "°F" : "K";
            System.out.printf(java.util.Locale.US, "%.2f °C = %.2f %s%n", celsius, result, unit);        }
    }
    public static double convert(double km) {
        return km * 0.621371;
    }public static double convert(double kg, String unit) {
        return kg * 2.20462;
    }
    public static double convert(double celsius, boolean toFahrenheit) {
        if (toFahrenheit) {
            return (celsius * 9 / 5) + 32;
        } else {
            return celsius + 273.15;
        }
    }
}