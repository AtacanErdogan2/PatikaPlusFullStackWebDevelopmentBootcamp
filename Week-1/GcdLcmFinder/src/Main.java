import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int n1, n2;
        int gcd = 0, lcm;

        // Retrieving data from the user
        System.out.print("Please enter the first number: ");
        n1 = input.nextInt();

        System.out.print("Please enter the second number: ");
        n2 = input.nextInt();

        // Calculation Section

        int i = 0;

        while (i < Math.min(n1, n2)) {
            i++;

            if (Math.min(n1, n2) % i == 0 && Math.max(n1, n2) % i == 0) {
                gcd = i;
            }

        }

        System.out.println("Greatest Common Divisor: " + gcd);

        lcm = (n1 * n2) / gcd;

        System.out.println("Least Common Multiple: " + lcm);

    }
}