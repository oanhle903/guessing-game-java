
/** A number guessing game. */
import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");

    Scanner input = new Scanner(System.in);
    // Get user's name
    System.out.println("Enter your name:");
    String name = input.nextLine();
    // Test that everything works
    System.out.println(name + ", I'm thinking of a number between 0 and 100.");

    Random rand = new Random();
    int randomNumber = rand.nextInt(100) + 1;

    int guessNumber;
    System.out.println("Try to guess the number.");
    System.out.println("Enter your guess:");
    guessNumber = input.nextInt();

    int count = 1;
    while (guessNumber != randomNumber) {
      
      if (guessNumber < randomNumber) {
        System.out.println("Your guess is too low, try again.");
        count++;
      }
      else if (guessNumber > randomNumber) {
        System.out.println("Your guess is too high, try again.");
        count++;
      }

      System.out.println("Enter your guess:");
      guessNumber = input.nextInt();
    }

    System.out.println("Well done, " + name + "! You found my number in " + count + " tries!");

  }
}
