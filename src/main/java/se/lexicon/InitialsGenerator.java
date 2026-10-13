
package se.lexicon;

import java.util.Scanner;

public class InitialsGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        String[] names = fullName.split(" ");
        char firstInitial = names[0].charAt(0);
        char lastInitial = names[names.length - 1].charAt(0);
        String initials;
        if (names.length == 2) {
            initials = firstInitial + "." + lastInitial + ".";
        } else {
            char middleInitial = names[1].charAt(0);
            initials = firstInitial + "." + middleInitial + "." + lastInitial + ".";
        }
        System.out.println("Initials: " + initials.toUpperCase());
    }
}
//Betty Jane Crocker