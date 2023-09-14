import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int a,b,c;
        int result;

        // Retrieving data from the user
        System.out.print("Please enter first number: ");
        a = input.nextInt();

        System.out.print("Please enter second number: ");
        b = input.nextInt();

        System.out.print("Please enter third number: ");
        c = input.nextInt();

        // Calculation Section
        result = a + b * c -b;

        System.out.println("Result: " + result);

    }
}