/*** 1) Build a program called "GuessMyNumber." The computer will
generate a random number between 1 and 10. The user types in a
number, and the computer replies “lower” if the random number is lower
than the guess, “higher” if the random number is higher , and “correct!” if
the guess is correct. The player can continue guessing until the guess is
2right.**/
package Q1;

import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // Generates a number between 1 and 10
        int userGuess = 0;

        System.out.println("Welcome to GuessMyNumber!");
        System.out.println("I have chosen a number between 1 and 10. Can you guess it?");


            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Invalid guess. Please enter a number between 1 and 10.");
            } else if (userGuess < randomNumber) {
                System.out.println("Lower");
            } else if (userGuess > randomNumber) {
                System.out.println("Higher");
            }
        

    }
}
