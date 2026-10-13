package se.lexicon;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a word: ");
        String word = scanner.nextLine();
        String lowerCaseWord = word.toLowerCase();
        String reversedWord = new StringBuilder(lowerCaseWord).reverse().toString();
        if (lowerCaseWord.equals(reversedWord)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }
}
//tattarrattat