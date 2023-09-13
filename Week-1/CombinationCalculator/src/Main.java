import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int n, r;
        int factorialN = 1, factorialR = 1, factorialNR = 1;

        // Retrieving data from the user
        System.out.println("Combination --> C(n,r) ");

        System.out.print("Please enter the 'n' :");
        n = input.nextInt();

        System.out.print("Please enter the 'r' :");
        r = input.nextInt();

        // Calculation Section
        for (int i = 1; i <= n; i++) {
            factorialN *= i;
        }

        for (int i = 1; i <= r; i++) {
            factorialR *= i;
        }

        for (int i = 1; i <= n - r; i++) {
            factorialNR *= i;
        }

        int combination = factorialN / (factorialR * factorialNR);

        System.out.println("C(" + n + "," + r + ") = " + combination);

    }
}