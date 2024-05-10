import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Guess a number between 1 and 100.");
        
        Scanner sc1 = new Scanner(System.in);
        boolean playAgain;
        do {
            playGame(); 
            System.out.println("Would you like to play again? y/n");
            playAgain = sc1.next().equalsIgnoreCase("Y");
        } while (playAgain);
        System.out.println("Thanks for playing. Better luck next time");
    }

    static void playGame() {
        int computersNumber = (int) (100 * Math.random()) + 1;
        int usersGuess;
        int guessCount = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("What is your guess? ");
            usersGuess = sc.nextInt();
            guessCount++;

            if (usersGuess == computersNumber) {
                System.out.println("You got it in " + guessCount + " guesses!  My number was " + computersNumber);
                break;
            } else if (guessCount == 6) {
                System.out.println("You didn't get the number in 6 guesses.");
                System.out.println("You lose.  My number was " + computersNumber);
                break;
            } else if (usersGuess < computersNumber) {
                System.out.println("That's too low.  Try again: ");
            } else if (usersGuess > computersNumber) {
                System.out.println("That's too high.  Try again: ");
            }
        }
    }
}