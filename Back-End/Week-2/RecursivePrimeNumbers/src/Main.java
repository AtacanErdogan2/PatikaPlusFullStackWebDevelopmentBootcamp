import java.util.Scanner;

public class Main {

    static String primeNumber(int number, int divisor) {
        if (number < 2) {
            return number + " is not a prime number.";
        } else if (divisor == 1) {
            return number + " is a prime number.";
        } else if (number % divisor == 0) {
            return number + " is not a prime number.";
        } else {
            return primeNumber(number, divisor - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int number;
        String result;

        // Retrieving data from the user
        System.out.print("Please enter a number:");
        number = input.nextInt();


        // Calculation Section
        result = primeNumber(number, number - 1);
        System.out.println(result);
    }
}