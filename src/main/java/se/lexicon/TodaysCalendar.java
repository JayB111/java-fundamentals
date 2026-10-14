
package se.lexicon;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodaysCalendar {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy", java.util.Locale.ENGLISH);
        System.out.println("Today is: " + today.format(formatter));
        if (today.getDayOfWeek().getValue() <= 5) {
            System.out.println("It is a Weekday.");
        } else {
            System.out.println("It is a Weekend.");
        }
    }
}
