package se.lexicon;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppointmentPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter appointment 1 name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter appointment 1 date-time (yyyy-MM-dd HH:mm): ");
        String dateTime1 = scanner.nextLine();
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("eeee, dd MMMM yyyy 'at' HH:mm", java.util.Locale.ENGLISH);
        LocalDateTime dateTime1Parsed = LocalDateTime.parse(dateTime1, inputFormatter);
        System.out.print("Enter appointment 2 name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter appointment 2 date-time (yyyy-MM-dd HH:mm): ");
        String dateTime2 = scanner.nextLine();
        LocalDateTime dateTime2Parsed = LocalDateTime.parse(dateTime2, inputFormatter);
        System.out.print("Enter appointment 3 name: ");
        String name3 = scanner.nextLine();
        System.out.print("Enter appointment 3 date-time (yyyy-MM-dd HH:mm): ");
        String dateTime3 = scanner.nextLine();
        LocalDateTime dateTime3Parsed = LocalDateTime.parse(dateTime3, inputFormatter);
        if (dateTime1Parsed.isAfter(dateTime2Parsed)) {
            LocalDateTime tempDate = dateTime1Parsed;
            dateTime1Parsed = dateTime2Parsed;
            dateTime2Parsed = tempDate;
            String tempName = name1;
            name1 = name2;
            name2 = tempName;
        }
        if (dateTime1Parsed.isAfter(dateTime3Parsed)) {
            LocalDateTime tempDate = dateTime1Parsed;
            dateTime1Parsed = dateTime3Parsed;
            dateTime3Parsed = tempDate;
            String tempName = name1;
            name1 = name3;
            name3 = tempName;
        }
        if (dateTime2Parsed.isAfter(dateTime3Parsed)) {
            LocalDateTime tempDate = dateTime2Parsed;
            dateTime2Parsed = dateTime3Parsed;
            dateTime3Parsed = tempDate;
            String tempName = name2;
            name2 = name3;
            name3 = tempName;
            System.out.println("\n--- Your Schedule ---");
            System.out.println("1. " + name1 + " – " + dateTime1Parsed.format(outputFormatter));
            System.out.println("2. " + name2 + " – " + dateTime2Parsed.format(outputFormatter));
            System.out.println("3. " + name3 + " – " + dateTime3Parsed.format(outputFormatter));
        }
    }
}

// Dinner with girls    2026-06-15 17:30
// Team Meeting         2026-06-12 09:00
// Slack off            2026-06-11 17:00