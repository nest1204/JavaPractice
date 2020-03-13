import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main{

    public static void main (String[] args) {

        System.out.println("Hey! Let's play Rock-Paper-Scissors!");
        System.out.println("You need to write down a number: 1 - for a Rock, 2 - for a Paper, 3 - for Scissors.");
        System.out.println("If you want to check the score type 777");
        System.out.println("Type 999 to exit game.");
        System.out.println("Ready? Go!");

        ArrayList<String> sal = new ArrayList<>();
        sal.add("Rock");
        sal.add("Paper");
        sal.add("Scissors");


        int userScore = 0;
        int computerScore = 0;
        boolean d = true;

        while (d) {
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 4);
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            if (userInput == 1 || userInput == 2 || userInput == 3) {
                System.out.println("You: " + sal.get(userInput - 1));
                System.out.println("Computer: " + (sal.get(randomNumber - 1)));

                if ((userInput == 1 && randomNumber == 3) || (userInput == 2 && randomNumber == 1) || (userInput == 3 && randomNumber == 2)) {
                    System.out.println("You WIN!\nNext round:");
                    userScore++;
                } else if ((userInput == 1 && randomNumber == 2) || (userInput == 2 && randomNumber == 3) || (userInput == 3 && randomNumber == 1)) {
                    System.out.println("You LOOSE!\nNext round:");
                    computerScore++;
                }
                else if (userInput == 777) {
                    System.out.println("\n*** SCORE ***");
                    System.out.println("YOU   |   COMPUTER");
                    System.out.println("  " + userScore + "         " + computerScore);
                }
                else {
                    System.out.println("DRAW\nNext round:");
                }

            }
            else if (userInput == 777) {
                System.out.println("\n*** SCORE ***");
                System.out.println("YOU   |   COMPUTER");
                System.out.println("  " + userScore + "         " + computerScore);
            }
            else if (userInput == 999) {
                d = false;
            }
            else {
                System.out.println("You wrote a wrong number. You can only write: 1 - for a Rock, 2 - for a Paper, 3 - for Scissors.");
                System.out.println("777 for the SCORE. And 999 for EXIT");
            }
        }


        System.out.println("\n*** FINAL SCORE ***");
        System.out.println("YOU   |   COMPUTER");
        System.out.println("  " + userScore + "         " + computerScore);








    }
    }