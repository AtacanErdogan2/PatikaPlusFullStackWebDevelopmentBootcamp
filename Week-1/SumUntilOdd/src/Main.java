import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int n;
        int sum = 0;

        // Retrieving data from the user and Calculation Section

        do {
            System.out.print("Please enter an even number:");
            n = input.nextInt();
            if (n % 4 == 0) {
                sum += n;
            }
        } while (n % 2 == 0);

        System.out.println("The sum of the entered numbers that are multiples of 4: " + sum);

    }
}