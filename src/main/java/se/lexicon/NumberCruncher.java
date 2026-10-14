
package se.lexicon;
import java.util.Scanner;

public class NumberCruncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number : ");
        int c = scanner.nextInt();
        int maximum = findMax(a, b, c);
        System.out.println("Maximum : " + maximum);
        int minimum = findMin(a, b, c);
        System.out.println("Minimum : " + minimum);
        double avg = average(a, b, c);
        System.out.printf("Average : %.2f%n", avg);
    }
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}
