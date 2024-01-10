import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int number;

        // Retrieving data from the user
        System.out.print("Please enter a number:");
        number = input.nextInt();

        // Calculation Section

        for ( int i = number; i >= 1; i--) {
            for (int k = 1;k <= (number-i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) - 1; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}