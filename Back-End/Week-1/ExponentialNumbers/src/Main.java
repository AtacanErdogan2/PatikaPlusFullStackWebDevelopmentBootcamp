import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int n, r;
        int exp = 1;

        // Retrieving data from the user
        System.out.println("Exponential --> n ^ r ");

        System.out.print("Please enter the 'n' :");
        n = input.nextInt();

        System.out.print("Please enter the 'r' :");
        r = input.nextInt();

        // Calculation Section
        for (int i = 1; i <= r; i++) {
            exp *= n;
        }

        System.out.println(n + " ^ " + r + " = " + exp);

    }
}