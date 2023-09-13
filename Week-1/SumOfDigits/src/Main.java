import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int number, digit;
        int total = 0;

        // Retrieving data from the user
        System.out.print("Please enter the number:");
        number = input.nextInt();

        // Calculation Section

        while(number > 0) {
            digit = number % 10;
            total += digit;
            number /= 10;
        }

        System.out.println("Sum of digits : " + total);

    }
}