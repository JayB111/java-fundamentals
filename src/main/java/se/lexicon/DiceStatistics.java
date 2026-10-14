
package se.lexicon;
import java.util.Scanner;

public class DiceStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rolls? ");
        int rolls = scanner.nextInt();
        int doubles = 0;
        for (int i = 1; i <= rolls; i++) {
            int die1 = (int) (Math.random() * 6) + 1;
            int die2 = (int) (Math.random() * 6) + 1;
            int total = die1 + die2;
            System.out.print("Roll " + i + ": " + die1 + " + " + die2 + " = " + total);
            if (die1 == die2) {
                doubles++;
                System.out.print(" DOUBLE!");
            }
            System.out.println();
        }
        System.out.println("Doubles rolled: " + doubles + " out of " + rolls);
    }
}
