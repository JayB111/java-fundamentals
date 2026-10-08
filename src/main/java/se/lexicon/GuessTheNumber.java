package se.lexicon;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(500) + 1;

        int guess = 0;
        int attempts = 0;

        while (guess != secretNumber) {
            System.out.print("Guess a number between 1 and 500: ");
            guess = scanner.nextInt();

            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too small!");
            } else if (guess > secretNumber) {
                System.out.println("Too big!");

            }

        }
        System.out.println("Correct! You got it in " + attempts + " attempts.");

    }
}