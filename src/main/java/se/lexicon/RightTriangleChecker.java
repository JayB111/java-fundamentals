
package se.lexicon;

import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter side c: ");        double c = scanner.nextDouble();
        double longestSide = Math.max(a, Math.max(b, c));
        System.out.println("Longest side: " + longestSide);
        if (longestSide == a) {
            if (b * b + c * c == a * a) {
                System.out.println("This IS a right triangle.");
            } else {
                System.out.println("This is NOT a right triangle.");
            }
        } else if (longestSide == b) {
            if (a * a + c * c == b * b) {
                System.out.println("This IS a right triangle.");
            } else {
                System.out.println("This is NOT a right triangle.");
            }
        } else {
            if (a * a + b * b == c * c) {
                System.out.println("This IS a right triangle.");
            } else {
                System.out.println("This is NOT a right triangle.");
            }
        }
    }
}
