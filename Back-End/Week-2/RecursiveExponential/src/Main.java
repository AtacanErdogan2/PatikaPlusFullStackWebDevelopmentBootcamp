import java.util.Scanner;

public class Main {

    static int calculateExponential(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return calculateExponential(base, exp - 1) * base;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int base, exponent, result;

        // Retrieving data from the user
        System.out.print("Please enter the base value:");
        base = input.nextInt();
        System.out.print("Please enter the exponential value:");
        exponent = input.nextInt();

        // Calculation Section
        result = calculateExponential(base, exponent);
        System.out.println(base + "^" + exponent + " --> " + result);
    }
}