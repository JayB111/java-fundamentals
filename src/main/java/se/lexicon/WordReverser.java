
package se.lexicon;

import java.util.Scanner;

public class WordReverser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String word = scanner.nextLine();
        StringBuilder reversed = new StringBuilder(word);
        reversed.reverse();
        System.out.println("Your reversed name is: " + reversed);

    }
}
