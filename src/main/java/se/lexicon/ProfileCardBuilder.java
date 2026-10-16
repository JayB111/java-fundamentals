package se.lexicon;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ProfileCardBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name      : ");
        String name = scanner.nextLine();
        System.out.print("Enter birth date: ");
        String birthInput = scanner.nextLine();
        System.out.print("Enter city      : ");
        String city = scanner.nextLine();
        System.out.print("Enter email     : ");
        String email = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthInput);
        LocalDate today = LocalDate.now();
        int age = Period.between(birthDate, today).getYears();
        StringBuilder card = new StringBuilder();
        card.append("╔══════════════════════════════╗\n");
        card.append("║         Profile Card         ║\n");
        card.append("╠══════════════════════════════╣\n");
        card.append(String.format("║ Name  : %-21s║%n", name));
        card.append(String.format("║ Age   : %-21d║%n", age));
        card.append(String.format("║ City  : %-21s║%n", city));
        card.append(String.format("║ Email : %-21s║%n", email));
        card.append("╚══════════════════════════════╝\n");
        System.out.println(card);
    }
}
// Nancy Shire
// 1035-07-21
// Stone Dynasty
// nancy@dynasty.com

