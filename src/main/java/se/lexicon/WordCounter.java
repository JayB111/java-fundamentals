
package se.lexicon;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter word to find: ");
        String searchWord = scanner.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("Total words: " + words.length);
        int count = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                count++;
            }
        }
        System.out.println("\"" + searchWord + "\" appears: " + count + " times");
    }
}
//To be or not to be that is the question