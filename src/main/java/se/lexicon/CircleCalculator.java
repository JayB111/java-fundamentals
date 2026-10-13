
package se.lexicon;

import java.util.Scanner;

public class CircleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf(java.util.Locale.US, "Area         : %.2f%n", area);
        System.out.printf(java.util.Locale.US, "Circumference: %.2f%n", circumference);
    }
}
