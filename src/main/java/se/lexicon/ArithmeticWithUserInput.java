package se.lexicon;

import java.util.Scanner;

public class ArithmeticWithUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        System.out.println("Addition: " + addition);

        int subtraction = firstNumber - secondNumber;
        System.out.println("Subtraction: " + subtraction);

        int multiplication = firstNumber * secondNumber;
        System.out.println("Multiplication: " + multiplication);

        int division = firstNumber / secondNumber;
        System.out.println("Division: " + division);

    }
}
