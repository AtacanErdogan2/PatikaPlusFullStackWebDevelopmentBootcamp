import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int number;

        // Retrieving data from the user
        System.out.print("Please enter the number:");
        number = input.nextInt();

        // Calculation Section

        Palindrome(number);

    }

    static void Palindrome(int number) {
        int tempNumber = number;
        int reverseNumber = 0;
        int lastDigit;

        while (tempNumber != 0) {
            lastDigit = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            tempNumber /= 10;
        }

        if (reverseNumber == number)
            System.out.println(number + " is a Palindrome number.");
        else
            System.out.println(number + " is not a Palindrome number.");

    }

}