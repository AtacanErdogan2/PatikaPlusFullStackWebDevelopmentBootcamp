import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100);
        int right = 5;
        int selected;

        System.out.println("\nWelcome to GuessMyNumber game :)");
        System.out.println("\nThe number chosen by the computer is between 0 and 100.");
        System.out.println("\nYou have " + right + " chances to guess the number correctly. Good Luck :)");

        while (right > 0) {
            System.out.print("\nPlease enter the number you guessed:");
            selected = scan.nextInt();

            if (selected == randomNumber) {
                System.out.println("\nWIN! WIN! WIN!");
                System.out.println("\nCongrats, you guessed the number correctly :) The number you guessed : " + randomNumber);
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("\nGame over :(");
                    System.out.println("\nCorrect result :" + randomNumber);
                    System.out.println("\nFeel free to try again :)");
                } else {
                    System.out.println("\nUnfortunately, your guess is not correct :( But don't worry, you have " + right + " more shots!");
                    System.out.println("\nHint");
                    if (randomNumber < selected) {
                        System.out.println("\nThe correct result is smaller than the number you guessed!\n");
                    } else {
                        System.out.println("\nThe correct result is greater than the number you guessed!\n");
                    }
                }
            }
        }

    }
}
