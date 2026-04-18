import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private int numberGuess;
    private int attempts;
    private int maxAttempts;
    private Scanner scanner;

    public NumberGuessingGame(int maxAttempts) {
        Random rand = new Random();
        this.numberGuess = rand.nextInt(100) + 1;
        this.attempts = 0;
        this.maxAttempts = maxAttempts;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("--- Number Guessing Game ---");
        System.out.println("Guess a number between 1 and 100, you have max: " + maxAttempts + " attempts");
        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + ": ");

            if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();

                if (guess == numberGuess) {
                    System.out.println("Congratulations! You guessed it!");
                    break;
                } else if (guess < numberGuess) {
                    System.out.println("Too low");
                    attempts++;
                } else if (guess > numberGuess) {
                    System.out.println("Too high");
                    attempts++;

                }
            } else {
                System.out.println("Invalid input please enter e valid number");
                scanner.next();
            }

        }
        if (attempts > maxAttempts) {
            System.out.println("Game over, The number is : " + numberGuess);
        }
    }
}
