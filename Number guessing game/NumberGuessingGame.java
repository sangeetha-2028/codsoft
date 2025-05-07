import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        int rounds = 0;

        while (true) {
            rounds++;
            System.out.println("\nRound " + rounds);

            // Generate a random number between 1 and 100
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1;

            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("Try to guess the number between 1 and 100.");

            while (attempts < maxAttempts && !guessedCorrectly) {
                attempts++;

                // Prompt user for their guess
                System.out.print("Attempt " + attempts + "/" + maxAttempts + ": Enter your guess: ");
                int guess = scanner.nextInt();

                // Provide feedback based on the guess
                if (guess < numberToGuess) {
                    System.out.println("Your guess is too low. Try again!");
                } else if (guess > numberToGuess) {
                    System.out.println("Your guess is too high. Try again!");
                } else {
                    System.out.println("Congratulations! You guessed the correct number " + numberToGuess + " in " + attempts + " attempts.");
                    guessedCorrectly = true;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + numberToGuess + ".");
            }

            // Calculate score (based on attempts taken)
            int score = Math.max(0, maxAttempts - attempts); // More points for fewer attempts
            totalScore += score;

            // Ask if the user wants to play again
            System.out.print("\nDo you want to play another round? (yes/no): ");
            scanner.nextLine();  // Consume newline left over
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        // Display the total score after the game ends
        System.out.println("\nGame over! You played " + rounds + " round(s).");
        System.out.println("Your total score is " + totalScore + " points.");
        System.out.println("Thank you for playing the game!");
        
        scanner.close();
    }
}

output:

Round 1
Try to guess the number between 1 and 100.
Attempt 1/10: Enter your guess: 50
Your guess is too high. Try again!
Attempt 2/10: Enter your guess: 35
Your guess is too low. Try again!
Attempt 3/10: Enter your guess: 40
Your guess is too low. Try again!
Attempt 4/10: Enter your guess: 45
Your guess is too low. Try again!
Attempt 5/10: Enter your guess: 48
Your guess is too high. Try again!
Attempt 6/10: Enter your guess: 47
Your guess is too high. Try again!
Attempt 7/10: Enter your guess: 46
Congratulations! You guessed the correct number 46 in 7 attempts.

Do you want to play another round? (yes/no): no

Game over! You played 1 round(s).
Your total score is 3 points.
Thank you for playing the game!