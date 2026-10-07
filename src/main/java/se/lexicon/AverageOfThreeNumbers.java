package se.lexicon;

import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        double average = sum / 3.0;

        System.out.println("Average: " + average);



    }
}