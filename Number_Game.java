import java.util.Random;
import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain;

        do {
            playGame(scanner, random);

            System.out.print("Do you want to guess the number again? (y/n): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("y");

        } while (playAgain);

        scanner.close();
    }

    private static void playGame(Scanner scanner, Random random) {
        System.out.print("Please Enter your Name: ");
        String userName = scanner.next();

        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Welcome, " + userName + "! Let's play the Number Guessing Game.");
        System.out.println("You have to Try to guess the number between 1 and 100.");

        int userGuess;
        int attempts = 0;

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Your guess is too low! Would you like to try to guess again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high! Would you like to try to guess again.");
            } else {
                System.out.println("Congratulations, " + userName + "! You guessed the number correctly in " + attempts
                        + " attempts.");
            }

        } while (userGuess != randomNumber);

        // Calculate and display the score
        int score = 100 - attempts;
        System.out.println("Your score for this level is: " + score);
    }
}
