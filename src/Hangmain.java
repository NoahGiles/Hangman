import java.util.Random;
import java.util.Scanner;

public class Hangmain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[]{"Eleven", "Duck", "Minority", "WOMAN", "Sacrifice", "Putrid", "Goat", "ItsNotSafePleaseHelpMePlease", "Impure", "Dying", "Martyr"};
        Random rand = new Random();
        int randWord = rand.nextInt(12);
        System.out.println(randWord);
        String chosenString = words[randWord];
        char userInput;
        String[] wordsAvailable = new String[chosenString.length()];

        System.out.println("Let's play Hangman! GUESS A LETTER >>> ");
        System.out.println();
        printSpaces(chosenString, wordsAvailable);
        System.out.println();
        userInput = input.next().charAt(0);
        for (int j = 0; j < chosenString.length(); ++j) {
            if (userInput == chosenString.charAt(j)) {

                wordsAvailable[j] = chosenString.substring(j) + " ";
            }
            else if (j == chosenString.length()) {

            }
        }
        printSpaces(chosenString, wordsAvailable);
        System.out.println();
    }

    public static void printSpaces(String chosenString, String wordsAvailable[]) {
        for (int i = 0; i < chosenString.length(); ++i) {
            wordsAvailable[i] = "_ ";
            System.out.print(wordsAvailable[i]);
        }

    }
}