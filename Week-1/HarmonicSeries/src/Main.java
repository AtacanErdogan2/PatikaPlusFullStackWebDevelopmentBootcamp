import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        double n;
        double result = 0;

        // Retrieving data from the user
        System.out.print("Please enter a number that you want to find harmonic series of it:");
        n = input.nextDouble();

        // Calculation Section

        for (double i = 1; i <= n; i++) {
            result += ( 1 / i ) ;
        }

        System.out.println("Sum of digits : " + result);

    }
}