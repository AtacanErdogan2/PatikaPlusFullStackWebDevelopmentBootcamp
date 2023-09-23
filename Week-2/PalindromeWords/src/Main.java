import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to the Palindrome Word Finder :)");

        System.out.print("\nPlease enter a word:");
        String word = input.nextLine();

        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }

        if (word.equals(reverseWord)) {
            System.out.println("\n" + word + " is a palindrome word.");
        } else {
            System.out.println("\n" + word + " is not a palindrome word.");
        }

    }
}
