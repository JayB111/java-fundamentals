
package se.lexicon;
import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter birth year : ");
        int year = scanner.nextInt();
        System.out.print("Enter birth month: ");
        int month = scanner.nextInt();
        System.out.print("Enter birth day  : ");
        int day = scanner.nextInt();
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        int age = today.getYear() - birthday.getYear();
        if (today.getMonthValue() < birthday.getMonthValue()
                || (today.getMonthValue() == birthday.getMonthValue()
                && today.getDayOfMonth() < birthday.getDayOfMonth())) {
            age--;
        }
        System.out.println("Your age            : " + age + " years");
        LocalDate nextBirthday = birthday.withYear(today.getYear());
        if (!nextBirthday.isAfter(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        long daysUntilBirthday = java.time.temporal.ChronoUnit.DAYS.between(today, nextBirthday);
        System.out.println("Days until birthday : " + daysUntilBirthday);
    }
}
