
package se.lexicon;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EventCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter event name: ");
        String eventName = scanner.nextLine();
        System.out.print("Enter event date (yyyy-MM-dd): ");
        String eventDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(eventDate);
        LocalDate today = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(today, date);
        if (daysBetween > 0) {
            System.out.println(eventName + " is in " + daysBetween + " days!");
        }
        else if (daysBetween < 0) {
            System.out.println(eventName + " was " + Math.abs(daysBetween) + " days ago.");
        }
        else {
            System.out.println(eventName + " is happening today!");
        }
    }
}
// Midnight Margareta   2026-12-25  else  2026-01-01