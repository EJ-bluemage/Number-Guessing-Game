import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100)+1;
        int choice;

        do {
            System.out.println("Please select the difficulty level: ");
            System.out.println("1. Easy (10 chances)");
            System.out.println("2. Medium (5 chances)");
            System.out.println("3. Hard (3 chances)");
            System.out.println();
    
            System.out.println("Enter your choice: ");
            int difficulty = scanner.nextInt();
    
            int attempts = 0;
            int maxAttempts = 0;
    
            switch(difficulty) {
                case 1: 
                    System.out.println("You have selected the Easy difficulty level.");
                    System.out.println("Let's start the game!");
                    System.out.println();
                    maxAttempts = 10;
                    break;
                case 2:
                    System.out.println("You have selected the Medium difficulty level.");
                    System.out.println("Let's start the game!");
                    System.out.println();
                    maxAttempts = 5;
                break;
                case 3:
                    System.out.println("You have selected the Hard difficulty level.");
                    System.out.println("Let's start the game!");
                    System.out.println();
                    maxAttempts = 3;
                break;
                default: 
                    System.out.println("Please pick a number from 1 to 3.");
                    System.out.println();
            }
    
            for (int i = 0; i < maxAttempts; i++) {
                System.out.println("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts = i + 1;
    
                if (number == guess) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts");
                    System.out.println();
                } else if (number < guess && i != maxAttempts - 1) {
                    System.out.println("Incorrect! The number is less than " + guess);
                    System.out.println();
                } else if (number > guess && i != maxAttempts - 1) {
                    System.out.println("Incorrect the number is greater than " + guess);
                    System.out.println();
                }
    
                if (i == maxAttempts - 1) {
                    System.out.println("You have run out of chances!");
                    System.out.println("The number is " + number);
                    System.out.println();
                }
            }
    
            System.out.println("Do you want to play again?");
            System.out.println("Enter 1 to play and 0 to exit: ");
            choice = scanner.nextInt();
        } while (choice == 1);
        
        scanner.close();
        System.out.println("Thank you for playing!");

    }
}
