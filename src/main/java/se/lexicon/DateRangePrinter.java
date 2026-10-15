package se.lexicon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DateRangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start date (yyyy-MM-dd): ");
        String startInput = scanner.nextLine();
        System.out.print("Enter end date   (yyyy-MM-dd): ");
        String endInput = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(startInput);
        LocalDate endDate = LocalDate.parse(endInput);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy (eeee)", Locale.ENGLISH);
        while (!startDate.isAfter(endDate)) {
            System.out.println(startDate.format(formatter));
            startDate = startDate.plusDays(1);
        }
    }
}
//  2026-06-08      2026-06-12