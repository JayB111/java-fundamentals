
package se.lexicon;

import java.util.Scanner;

public class PowerTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        for (int power = 1; power <= 10; power++) {
            double result = Math.pow(base, power);
            System.out.println(base + " ^ " + power + " = " + result);
        }
    }
}
