package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    static Scanner read = new Scanner(System.in);

    public static void easyMode() {
        boolean success = false;
        int correctNumber = (int)(Math.random() * 10) + 1;
        while (!success) {
            try {
                System.out.print("Pick a number (between #1 - #10): ");
                int guessedNumber = read.nextInt();
                read.nextLine(); // clear newline

                if (guessedNumber < 1 || guessedNumber > 10) {
                    System.out.println(" Number out of range. Pick between 1 and 10.");
                    continue;
                }
                if(guessedNumber != correctNumber) {
                    if(guessedNumber > correctNumber) {
                        System.out.println("It's to high");
                    }
                    if(guessedNumber < correctNumber )  {
                        System.out.println("its to low");
                    }
                    System.out.println("Wrong, try it again");
                    continue;
                }
                System.out.println("You guessed it correct ");
                success = true;

            } catch (InputMismatchException e) {
                System.out.println(" Not a valid number. Please enter digits only.");
                read.nextLine(); // clear invalid input
            } catch (Exception e) {
                System.out.println("⚠️ Something else went wrong: " + e.getMessage());
                read.nextLine();
            }
        }

        read.close();
    }

    public static void hardMode() {
        boolean success = false;
        int correctNumber = (int)(Math.random() * 100) + 1;
        int tries = 5;
        while (!success) {
            try {
                System.out.print("Pick a number (between #1 - #100): ");
                int guessedNumber = read.nextInt();
                read.nextLine(); // clear newline

                if (guessedNumber < 1 || guessedNumber > 100) {
                    System.out.println(" Number out of range. Pick between 1 and 10.");
                    continue;
                }
                if (guessedNumber != correctNumber) {
                    if (guessedNumber > correctNumber) {
                        System.out.println("It's to high");
                    }
                    if (guessedNumber < correctNumber) {
                        System.out.println("its to low");
                    }
                    System.out.println("Wrong, try it again");
                    tries--;
                    System.out.println("You have " + tries + " tries left");
                    if(tries == 0) {
                        System.out.println("You ran out of attempts!");
                        System.out.println("Kick rocks loser!");
                        break;
                    }
                } else {
                    System.out.println("You guessed it correct!");
                    success = true;
                }
            } catch (InputMismatchException e) {
                System.out.println(" Not a valid number. Please enter digits only.");
                read.nextLine(); // clear invalid input
            } catch (Exception e) {
                System.out.println("⚠️ Something else went wrong: " + e.getMessage());
                read.nextLine();
            }
        }

        read.close();
    }
}
