
package se.lexicon;

import java.util.Scanner;

public class StringStats {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a secret message: ");
        String sentence = scanner.nextLine();
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' ||
                    currentChar == 'i' || currentChar == 'o' ||
                    currentChar == 'u') {
                vowels++;
            }
            if (Character.isLetter(currentChar) &&
                    currentChar != 'a' && currentChar != 'e' &&
                    currentChar != 'i' && currentChar != 'o' &&
                    currentChar != 'u') {
                consonants++;
            }
            if (Character.isDigit(currentChar)) {
                digits++;
            }
            if (currentChar == ' ') {
                spaces++;
            }
        }
        System.out.println("Vowels    : " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits    : " + digits);
        System.out.println("Spaces    : " + spaces);
    }
}
//The key is in my pocket
