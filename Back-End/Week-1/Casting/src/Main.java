import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int intValue;
        double doubleValue;

        // Retrieving data from the user
        System.out.print("Please enter an integer: ");
        intValue = input.nextInt();

        System.out.print("Please enter a decimal number: ");
        doubleValue = input.nextDouble();

        // Calculation Section
        System.out.println("int to double --> " + (double) intValue);
        System.out.println("double to int --> " + (int) doubleValue);

    }
}