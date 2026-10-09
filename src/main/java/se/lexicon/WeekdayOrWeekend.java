package se.lexicon;

import java.util.Scanner;

public class WeekdayOrWeekend {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();
        switch (day) {case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day number");

        }

    }
}