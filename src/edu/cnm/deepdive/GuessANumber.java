package edu.cnm.deepdive;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
  
  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int numberToGuess;
    boolean found;
    boolean again;
    String response;
    int attempts;
    boolean surrender;

    again = true;
    while (again) {
      numberToGuess = random.nextInt(100) + 1;
      found = false;
      surrender = false;
      while (!found && !surrender) {
        int myGuess;
        System.out.println("Please enter a guess");
        myGuess = input.nextInt();
        if (myGuess == 0) {
          surrender = true;
        } else if (myGuess == numberToGuess) {
          System.out.println(
              "Congragulations your guess was correct. The number was " + numberToGuess + "");
          found = true;
        } else if (myGuess > numberToGuess) {
          System.out.println("Your guess is too high");
        } else {
          System.out.println("Your guess is too low");
        }
      }
      System.out.println("Would you like to play again?");
      do {
        response = input.nextLine(). trim() .toLowerCase();
      } while (response.isEmpty());
      again = response.charAt(0) == 'y';
      System.out.println("thank you for playing");
    }
  }
}